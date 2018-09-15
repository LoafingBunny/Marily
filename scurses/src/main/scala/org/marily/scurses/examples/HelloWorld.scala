package org.marily.scurses.examples

import org.marily.scurses.Colors.BRIGHT_BLACK
import org.marily.scurses.Scurses

object HelloWorld extends App {
  Scurses { screen =>
    val (w, h) = screen.size
    val greeting = "Hello, world!"
    val prompt = "Press a key to continue..."
    screen.put(w/2 - greeting.length/2, h/2, greeting)
    screen.put(w/2 - prompt.length/2, h/2 + 1, prompt, BRIGHT_BLACK.code)
    screen.refresh()
    screen.keypress()
  }
}
