package org.marily.scurses

object Keys {

  val PUA = 0xE000 // Unicode private use area, safe for our own codes

  // Resize signal
  val RESIZE: Int = PUA + 1000

  // Normal keys
  val CTRL_SPACE = 0
  val CTRL_C     = 3
  val TAB        = 9
  val ENTER      = 13
  val ESC        = 27
  val SPACE      = 32
  val BACKSPACE  = 127

  // CSI keys
  val UP : Int       = PUA + 0
  val DOWN: Int      = PUA + 1
  val LEFT: Int      = PUA + 2
  val RIGHT: Int     = PUA + 3
  val SHIFT_TAB: Int = PUA + 4

  def repr(key: Int): String = key match {
    case RESIZE    => "RESIZE"
    case CTRL_SPACE=> "CTRL+SPACE"
    case CTRL_C    => "CTRL+C"
    case TAB       => "⇥ "
    case ENTER     => "↵ "
    case ESC       => "ESC"
    case SPACE     => "SPACE"
    case BACKSPACE => "⇤ "
    case UP        => "↑"
    case DOWN      => "↓"
    case LEFT      => "←"
    case RIGHT     => "→"
    case SHIFT_TAB => "⇧ +⇥ "
    case _ => key.toChar.toString
  }
}