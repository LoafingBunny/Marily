package org.marily.onions.components.widgets

import org.marily.onions.components.FramePanel
import org.marily.onions.components.widgets.BigText.{empty, symbols}
import org.marily.onions.utils.Varying
import org.marily.scurses.{Colors, Scurses}

case class SevenSegment(parent: FramePanel, text: Varying[String])
                       (implicit screen: Scurses) extends FontMapper(parent, empty, symbols, text) {

  color := Colors.BRIGHT_GREEN.code
}

object SevenSegment {
  var empty = Seq("", "", "")
  val symbols = Map(
    'a' -> Seq(
      " _  ",
      "|_| ",
      "| | "),
    'b' -> Seq(
      " _  ",
      "|_| ",
      "|_| "),
    'c' -> Seq(
      " _  ",
      "|   ",
      "|_  "),
    'd' -> Seq(
      "    ",
      " _| ",
      "|_| "),
    'e' -> Seq(
      " _  ",
      "|_  ",
      "|_  "),
    'f' -> Seq(
      " _  ",
      "|_  ",
      "|   "),
    'g' -> Seq(
      " _  ",
      "|_| ",
      " _| "),
    'h' -> Seq(
      "    ",
      "|_  ",
      "| | "),
    'i' -> Seq(
      "    ",
      "|   ",
      "|   "),
    'j' -> Seq(
      "    ",
      "  | ",
      "|_| "),
    'k' -> Seq(
      "    ",
      "|_| ",
      "| | "),
    'l' -> Seq(
      "    ",
      "|   ",
      "|_  "),
    'm' -> Seq(
      " _  ",
      "    ",
      "| | "),
    'n' -> Seq(
      "    ",
      " _  ",
      "| | "),
    'o' -> Seq(
      "    ",
      " _  ",
      "|_| "),
    'p' -> Seq(
      " _  ",
      "|_| ",
      "|   "),
    'q' -> Seq(
      " _  ",
      "|_| ",
      "  | "),
    'r' -> Seq(
      "    ",
      " _  ",
      "|   "),
    's' -> Seq(
      " _  ",
      "|_  ",
      " _| "),
    't' -> Seq(
      "    ",
      "|_  ",
      "|_  "),
    'u' -> Seq(
      "    ",
      "| | ",
      "|_| "),
    'v' -> Seq(
      "    ",
      "    ",
      "|_| "),
    'w' -> Seq(
      "    ",
      "| | ",
      " _  "),
    'x' -> Seq(
      "    ",
      "|_| ",
      "| | "),
    'y' -> Seq(
      "    ",
      "|_| ",
      " _| "),
    'z' -> Seq(
      " _  ",
      " _| ",
      "|_  "),
    '0' -> Seq(
      " _  ",
      "| | ",
      "|_| "),
    '1' -> Seq(
      "    ",
      "  | ",
      "  | "),
    '2' -> Seq(
      " _  ",
      " _| ",
      "|_  "),
    '3' -> Seq(
      " _  ",
      " _| ",
      " _| "),
    '4' -> Seq(
      "    ",
      "|_| ",
      "  | "),
    '5' -> Seq(
      " _  ",
      "|_  ",
      " _| "),
    '6' -> Seq(
      " _  ",
      "|_  ",
      "|_| "),
    '7' -> Seq(
      " _  ",
      "  | ",
      "  | "),
    '8' -> Seq(
      " _  ",
      "|_| ",
      "|_| "),
    '9' -> Seq(
      " _  ",
      "|_| ",
      " _| "),
    ':' -> Seq(
      "    ",
      " ·  ",
      " ·  "),
    '.' -> Seq(
      "    ",
      "    ",
      " ·  "),
    ' ' -> Seq(
      "    ",
      "    ",
      "    "),
    '-' -> Seq(
      "    ",
      " -  ",
      "    ")
  )
}