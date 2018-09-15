package org.marily.onions.components.widgets

import org.marily.onions.Themes.ColorScheme
import org.marily.onions.components.{FramePanel, Widget}
import org.marily.onions.utils.{TextWrap, Varying}
import org.marily.scurses.RichText.RichText
import org.marily.scurses.Scurses

case class RichLabel(parent: FramePanel, text: Varying[RichText])
                    (implicit screen: Scurses) extends Widget(parent, text) {

  var lines: Seq[RichText] = Seq()

  override def redraw(focus: Boolean, theme: ColorScheme): Unit = {
    lines = TextWrap.wrapText(text.value, innerWidth - 1)
    for ((_, i) <- lines.zipWithIndex) {
      screen.putRichText(1, i, lines(i), theme.foreground, theme.background)
    }
  }

  override def handleKeypress(keypress: Int): Unit = { }

  override def focusable: Boolean = false
  override def innerHeight: Int = lines.length
}
