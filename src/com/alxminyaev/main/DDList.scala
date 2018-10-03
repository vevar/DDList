package com.alxminyaev.main

class DDList[T] extends IList [T]{

  private class SubList[sT] extends IList[sT]{

    var capacity : Int = 20

    override def add(elem: sT): Unit = ???

    override def add(index: Int, elem: sT): Unit = ???

    override def remove(index: Int): Unit = ???

    override def remove(elem: sT): Unit = ???

    override def get(int: Int): Unit = ???

    override def indexOf(elem: sT): Unit = ???
  }

  var size : Int = 0
  var head : Node[T] = _
  var tail : Node[T] = _

  def addToEnd(elem: T): Unit = {
    var newNode = new Node[T](elem)
    tail.nextPtr =

  }

  override def add(value: T): Unit = {
    if (head == null){
      head = new Node[T](value)
      tail = head
    }
    else {
      addToEnd(value)
    }
  }

  override def add(index: Int, elem: T): Unit = ???

  override def remove(index: Int): Unit = ???

  override def remove(elem: T): Unit = ???

  override def get(int: Int): Unit = ???

  override def indexOf(elem: T): Unit = ???
}
