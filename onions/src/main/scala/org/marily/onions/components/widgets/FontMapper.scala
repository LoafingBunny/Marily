package org.marily.onions.components.widgets

import org.marily.onions.Themes.ColorScheme
import org.marily.onions.components.{FramePanel, Widget}
import org.marily.onions.utils.Varying
import org.marily.scurses.{Colors, Scurses}

abstract class FontMapper(parent: FramePanel, empty: Seq[String],
                          symbols: Map[Char, Seq[String]], text: Varying[String],
                          var color: Varying[Int] = Colors.BRIGHT_WHITE.code)
                         (implicit screen: Scurses) extends Widget(parent, text, color) {

  override def focusable: Boolean = false

  var height: Int = empty.length

  override def redraw(focus: Boolean, theme: ColorScheme): Unit = {
    val t = text.value
    val h = empty.length
    if (!t.isEmpty) {
      val charsSymbols = t.toLowerCase.map(c => (c, symbols.getOrElse(c, empty).head.length))
      val wrapped = charsSymbols.foldLeft(Seq[(String, Int)](("", 0))) { case (accu, (char, l)) =>
        val current = accu.last
        if (current._2 + l > innerWidth) {
          accu :+ (s"$char", l)
        } else {
          accu.init :+ (current._1 + char, current._2 + l)
        }
      }
      val wrappedText = wrapped.map(_._1)
      height = wrapped.length * empty.length
      val width = wrapped.maxBy(_._2)._2
      val c = if (color.value < 0) theme.foreground else color.value
      for ((chunk, i) <- wrappedText.zipWithIndex) {
        val chars = chunk.toLowerCase.map(symbols.getOrElse(_, empty) ++ Seq("    "))
        for (y <- 0 until h) {
          screen.put((innerWidth - width) / 2, y + i * 3, ("" /: chars)((line, char) => line + char(y)),
            foreground = c, background = theme.background)
        }
      }
    }
  }

  override def handleKeypress(keypress: Int): Unit = { }

  override def innerHeight: Int = height
}
