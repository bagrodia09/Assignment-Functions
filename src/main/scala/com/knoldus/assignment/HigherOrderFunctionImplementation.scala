package com.knoldus.assignment

class HigherOrderFunctionImplementation {
  def addToSame(value: Int): Int = value + value

  def multiplyToSame(value: Int): Int = value * value

  val higherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    def apply(function: Int => Int, Value: Int): Int = function(Value)
  }
}
