package org.marily.onions.components.widgets

import org.marily.onions.components.FramePanel
import org.marily.scurses.Scurses

case class Spacer(parent: FramePanel)(implicit screen: Scurses) extends Separator(parent, " ") { }
