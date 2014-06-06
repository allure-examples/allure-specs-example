package ru.yandex.qatools.allure.specs2

import org.specs2.mutable.Specification
import scala.collection.mutable

class StackSpec extends Specification {

  "A Stack" should {
    
    "pop values in last-in-first-out order" in {
      val stack = new mutable.Stack[Int]
      stack.push(1)
      stack.push(2)
      stack.pop() mustEqual 2
      stack.pop() mustEqual 1
    }

  }

}
