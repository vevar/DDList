package com.alxminyaev.main

abstract class AList[T] extends IList[T] {

  protected var size: Int = 0

  protected var head: Node[T] = _
  protected var tail: Node[T] = _

  class Iterator[T] extends IIterator[T] {

    var currentPosition : Node[T] = head

    override def next(): Node[T] = {
      if (currentPosition == null) {
        currentPosition = begin()
      }else{
        currentPosition = currentPosition.nextPtr
      }
      currentPosition
    }

    override def back(): Node[T] = {
      if (currentPosition == null) {
        currentPosition = end()
      }else{
        currentPosition = currentPosition.backPtr
      }
      currentPosition
    }

    override def begin(): Node[T] = {
      currentPosition = head
      currentPosition
    }

    override def end(): Node[T] = {
      currentPosition = tail
      currentPosition
    }
  }

  protected abstract def addToEnd(node: Node[T]): Unit
  protected abstract def addToHead(node: Node[T]) : Unit
  protected abstract def addToPosition(i : Int, node: Node[T])


}