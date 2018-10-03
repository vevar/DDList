package com.alxminyaev.main

trait IList[T] {
  def add(elem : T)
  def add (index : Int, elem : T)
  def remove(index : Int)
  def remove(elem : T)
  def get(int : Int)
  def indexOf(elem : T)
}
