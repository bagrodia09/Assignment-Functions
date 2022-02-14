package com.knoldus.assignment

class SumOfList {
  val sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    def apply(list: List[Int]): Int = list.sum
  }
}
