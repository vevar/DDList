package com.alxminyaev.main

import com.alxminyaev.main.DDList.DDList

object Application extends App {
  val list = new DDList[Int]
  for (i <- 0 to 6) {
    list.add(i)
  }
  println(5)
}
