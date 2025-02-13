package com.baedung.scala.lazylists

import com.baeldung.scala.lazylists.{SimpleList, :@:, SLNil}
import org.scalatest.wordspec.AnyWordSpec

class SimpleListSpec extends AnyWordSpec {
  "A list" should {
    "Allow the creation of a one Element list" in {
      assertResult(5)((5 :: SLNil).head)
    }
    "Throw and Stack Overflow Exception if used to define a Fibonacci sequence" in {
      intercept[StackOverflowError] {
        def fibonacci(current: Int = 0, next: Int = 1): SimpleList[Int] =
          :@:(current, fibonacci(next, current + 1))
        assertResult(8)(fibonacci().!!(7))
      }
    }
  }
}
