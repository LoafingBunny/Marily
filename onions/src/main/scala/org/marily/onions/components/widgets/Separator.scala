package org.marily.onions.components.widgets

import org.marily.onions.Symbols
import org.marily.onions.Themes.ColorScheme
import org.marily.onions.components.{FramePanel, Widget}
import org.marily.scurses.Scurses

object Separator {
  def apply(parent: FramePanel, symbol: String = Symbols.SH)(implicit screen: Scurses) = {
    new Separator(parent, symbol)
  }
}

class Separator(parent: FramePanel, symbol: String = Symbols.SH)
               (implicit screen: Scurses) extends Widget(parent) {

  val focusable: Boolean = false

  override def redraw(focus: Boolean, theme: ColorScheme): Unit = {
    screen.put(0, 0, symbol * innerWidth, foreground = theme.accent3, background = theme.background)
  }

  override def handleKeypress(keypress: Int): Unit = { }

  override def innerHeight: Int = 1
}
