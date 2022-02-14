package com.knoldus.assignment

class Addition {
  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber
  }
  add.apply(10,10)
}
