package com.alxminyaev.main.DDList

final class DDList[T] extends IList[T] {

  private var size: Int = 0

  private var head: Node[SubList[T]] = _
  private var tail: Node[SubList[T]] = _

  final private class Node[nodeT](var value: nodeT) {
    var nextPtr: Node[nodeT] = _
    var backPtr: Node[nodeT] = _
  }

  final private class SubList[subT] {

    private var capacity: Int = 3
    private var size: Int = 0

    private var head: Node[subT] = _
    private var tail: Node[subT] = _

    private def addToHead(newNode: Node[subT]): Unit = {
      newNode.nextPtr = newNode
      newNode.backPtr = newNode
      head = newNode
      tail = newNode
    }

    private def addToTail(newNode: Node[subT]): Unit = {
      newNode.backPtr = tail
      newNode.nextPtr = head
      tail.nextPtr = newNode
      head.backPtr = newNode
      tail = newNode

    }

    def add(elem: subT): Unit = {
      if (elem != null) {
        val newNode = new Node[subT](elem)
        if (head == null) {
          addToHead(newNode)
        } else {
          addToTail(newNode)
        }
        size = size + 1
      }
    }

    def isFull: Boolean = {
      if (size < capacity) {
        false
      } else {
        true
      }
    }
  }

  private def addToNewHead(elem: T): Unit = {
    head = new Node[SubList[T]](new SubList[T]())
    head.nextPtr = head
    head.backPtr = head
    tail = head
    head.value.add(elem)
  }

  private def addToNewTail(elem: T): Unit = {
    val newTail = new Node[SubList[T]](new SubList[T])
    newTail.nextPtr = head
    newTail.backPtr = tail
    head.backPtr = newTail
    tail.nextPtr = newTail
    tail = newTail
    tail.value.add(elem)
  }

  private def addToCurrentTail(elem: T): Unit = {
    tail.value.add(elem)
  }

  override def add(elem: T): Unit = {
    if (head == null) {
      addToNewHead(elem)
    } else if (tail.value.isFull) {
      addToNewTail(elem)
    } else {
      addToCurrentTail(elem)
    }
    size = size + 1
  }

  override def add(index: Int, elem: T): Unit = ???

  override def remove(index: Int): Unit = ???

  override def remove(elem: T): Unit = ???

  override def get(int: Int): Unit = ???

  override def indexOf(elem: T): Unit = ???
}
