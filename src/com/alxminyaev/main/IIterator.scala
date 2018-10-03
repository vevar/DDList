package com.alxminyaev.main

trait IIterator[T] {
  def next() : Node[T]
  def back() : Node[T]
  def begin() : Node[T]
  def end() : Node[T]
}
