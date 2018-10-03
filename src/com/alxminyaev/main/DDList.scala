package com.alxminyaev.main

class DDList[T] extends AList [T]{

  private class SubList[sT] extends AList [sT]{

    var capacity : Int = 20

    override def add(elem: sT): Unit = {
      val node : Node[sT] = new Node[sT](elem)

      if (head == null){
        head = node
        head.nextPtr = head
        head.backPtr = head
        tail = head
      }else{
        addToEnd(node)
        size = size + 1
      }
    }

    override def add(index: Int, elem: sT): Unit = {
      val node : Node[sT] = new Node[sT](elem)

      if (index >= size){
        addToEnd(node)
      }else{
        addToPosition(index, node)
      }
    }

    override def remove(index: Int): Unit = ???

    override def remove(elem: sT): Unit = ???

    override def get(int: Int): Unit = ???

    override def indexOf(elem: sT): Unit = ???

    override protected def addToEnd(node: Node[sT]): Unit = {
      node.nextPtr = head
      node.backPtr = tail
      tail.nextPtr = node
      head.backPtr = node
      tail = node
    }

    override protected def addToHead(node: Node[sT]): Unit = {
      node.nextPtr = head
      node.backPtr = tail
      head.backPtr = node
      tail.nextPtr = node
      head = node
    }

    override protected def addToPosition(i: Int, node: Node[sT]): Unit = {

    }

    def isFull: Boolean = {
      size == capacity
    }
  }

  override protected def addToEnd(node: Node[T]): Unit = ???

  override protected def addToHead(node: Node[T]): Unit = ???

  override protected def addToPosition(i: Int, node: Node[T]): Unit = ???

  override def add(elem: T): Unit = ???

  override def add(index: Int, elem: T): Unit = ???

  override def remove(index: Int): Unit = ???

  override def remove(elem: T): Unit = ???

  override def get(int: Int): Unit = ???

  override def indexOf(elem: T): Unit = ???
}
