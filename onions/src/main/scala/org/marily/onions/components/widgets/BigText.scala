package org.marily.onions.components.widgets

import org.marily.onions.components.FramePanel
import org.marily.onions.utils.Varying
import org.marily.onions.components.widgets.BigText.{empty, symbols}
import org.marily.scurses.Scurses

case class BigText(parent: FramePanel, text: Varying[String])
                  (implicit screen: Scurses) extends FontMapper(parent, empty, symbols, text, -1)

object BigText {
  var empty = Seq("", "", "")
  val symbols = Map(
    'a' -> Seq(
      "┌─┐",
      "├─┤",
      "┴ ┴"),
    'b' -> Seq(
      "┌┐ ",
      "├┴┐",
      "└─┘"),
    'c' -> Seq(
      "┌─┐",
      "│  ",
      "└─┘"),
    'd' -> Seq(
      "┌┬┐",
      " ││",
      "─┴┘"),
    'e' -> Seq(
      "┌─┐",
      "├┤ ",
      "└─┘"),
    'f' -> Seq(
      "┌─┐",
      "├┤ ",
      "└  "),
    'g' -> Seq(
      "┌─┐",
      "│ ┬",
      "└─┘"),
    'h' -> Seq(
      "┬ ┬",
      "├─┤",
      "┴ ┴"),
    'i' -> Seq(
      "┬",
      "│",
      "┴"),
    'j' -> Seq(
      " ┬",
      " │",
      "└┘"),
    'k' -> Seq(
      "┬┌─",
      "├┴┐",
      "┴ ┴"),
    'l' -> Seq(
      "┬  ",
      "│  ",
      "┴─┘"),
    'm' -> Seq(
      "┌┬┐",
      "│││",
      "┴ ┴"),
    'n' -> Seq(
      "┌┐┌",
      "│││",
      "┘└┘"),
    'o' -> Seq(
      "┌─┐",
      "│ │",
      "└─┘"),
    'p' -> Seq(
      "┌─┐",
      "├─┘",
      "┴  "),
    'q' -> Seq(
      "┌─┐ ",
      "│─┼┐",
      "└─┘└"),
    'r' -> Seq(
      "┬─┐",
      "├┬┘",
      "┴└─"),
    's' -> Seq(
      "┌─┐",
      "└─┐",
      "└─┘"),
    't' -> Seq(
      "┌┬┐",
      " │ ",
      " ┴ "),
    'u' -> Seq(
      "┬ ┬",
      "│ │",
      "└─┘"),
    'v' -> Seq(
      "┬  ┬",
      "└┐┌┘",
      " └┘ "),
    'w' -> Seq(
      "┬ ┬",
      "│││",
      "└┴┘"),
    'x' -> Seq(
      "─┐ ┬",
      "┌┴┬┘",
      "┴ └─"),
    'y' -> Seq(
      "┬ ┬",
      "└┬┘",
      " ┴ "),
    'z' -> Seq(
      "┌─┐",
      "┌─┘",
      "└─┘"),
    '0' -> Seq(
      "┌─┐",
      "│ │",
      "└─┘"),
    '1' -> Seq(
      "┐",
      "│",
      "┴"),
    '2' -> Seq(
      "┌─┐",
      "┌─┘",
      "└─┘"),
    '3' -> Seq(
      "┌─┐",
      " ─┤",
      "└─┘"),
    '4' -> Seq(
      "┬ ┬",
      "└─┤",
      "  ┴"),
    '5' -> Seq(
      "┌─┐",
      "└─┐",
      "└─┘"),
    '6' -> Seq(
      "┌─┐",
      "├─┐",
      "└─┘"),
    '7' -> Seq(
      "┌─┐",
      "  ┼",
      "  ┴"),
    '8' -> Seq(
      "┌─┐",
      "├─┤",
      "└─┘"),
    '9' -> Seq(
      "┌─┐",
      "└─┤",
      "└─┘"),
    ':' -> Seq(
      " ",
      "·",
      "·"),
    '.' -> Seq(
      " ",
      " ",
      "·"),
    ' ' -> Seq(
      "  ",
      "  ",
      "  "),
    '-' -> Seq(
      " ",
      "─",
      " ")
  )
}