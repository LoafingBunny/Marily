package org.marily.onions.components

import org.marily.onions.Component
import org.marily.onions.Themes.ColorScheme
import org.marily.onions.utils.Varying
import org.marily.scurses.Scurses

abstract class Widget(parent: FramePanel, values: Varying[_] *)
                     (implicit screen: Scurses) extends Component(Some(parent)) {

  parent.addWidget(this)

  for (value <- values)
    value.subscribe(() => {
      needsRedraw = true
    })

  def focusable: Boolean

  var needsRedraw = true

  def draw(focus: Boolean, theme: ColorScheme): Unit = {
    redraw(focus, theme)
    needsRedraw = false
  }

  def redraw(focus: Boolean, theme: ColorScheme): Unit

  def handleKeypress(keypress: Int): Unit

  override def innerWidth: Int = parent.innerWidth - 3

  override def toString: String = this.getClass.getSimpleName + " @ " + Integer.toHexString(System.identityHashCode(this))
}
