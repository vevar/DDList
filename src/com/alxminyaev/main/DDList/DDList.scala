package com.alxminyaev.main.DDList

final class DDList[T] extends IList[T]{

  private var size: Int = 0

  private var head: Node[SubList[T]] = _
  private var tail: Node[SubList[T]] = _

  final private class Node[nodeT](var value : nodeT)  {
    var nextPtr: Node[nodeT] = _
    var backPtr : Node[nodeT] = _
  }

  final private class SubList[subT] extends IList[subT]{

    private var capasity : Int = 10
    private var size : Int = 0

    private var head: Node[subT] = _
    private var tail: Node[subT] = _

    private def addToHead(newNode: Node[subT]) = {
      newNode.nextPtr = newNode
      newNode.backPtr = newNode
      head = newNode
      tail = newNode
    }

    override def add(elem: subT): Unit = {
      if (elem != null){
        val newNode = new Node[subT](elem)
        if (head == null){
          addToHead(newNode)
        }else {
          addToTail(newNode)
        }
      }
    }

    override def add(index: Int, elem: subT): Unit = ???

    override def remove(index: Int): Unit = ???

    override def remove(elem: subT): Unit = ???

    override def get(int: Int): Unit = ???

    override def indexOf(elem: subT): Unit = ???
  }

  override def add(elem: T): Unit = ???

  override def add(index: Int, elem: T): Unit = ???

  override def remove(index: Int): Unit = ???

  override def remove(elem: T): Unit = ???

  override def get(int: Int): Unit = ???

  override def indexOf(elem: T): Unit = ???
}
