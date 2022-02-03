package module1
import collections.task_collections.{capitalizeIgnoringASCII, numbersToNumericString}

import scala.util.control.Breaks._

object App {

  def main(args: Array[String]): Unit = {

//    println(capitalizeIgnoringASCII(List("Lorem", "ipsum" )))
//    println(capitalizeIgnoringASCII(List("ЗвУк", "КЛАВИШЬ")))
//    println(numbersToNumericString("Hello. I am 9 years old"))


    val RGB = Seq("R","G","B")
    val someRang = Range.apply(1,4)
    for(el <- RGB) println(el)
    for(el1 <- RGB; el2 <- someRang) println(s"""$el1 - $el2""")
    for(el1 <- RGB; el2 <- RGB; el3 <- RGB) println(s"""$el1 - $el2 - $el3""")
    println("------------сочетания без посторений------------")
    for(el1 <- RGB;
        el2 <- RGB;
        if el1 != el2;
        el3 <- RGB;
        if el1 != el3 && el2 != el3)
      println(s"""$el1 - $el2 - $el3""")





    println("------------for comprehension------------")

    def doomyFunc(a: String) = {
      Thread.sleep(1000)
      println(a)
    }

    val doomyFuncWithLoggingTime: String => Unit = hof.logRunningTime(doomyFunc)

    val v: PartialFunction[(Int, Int), Int] = {
      case (x, y) if y != 0 => x / y
    }

    val v2: PartialFunction[(Int, Int), Int] =
      new PartialFunction[(Int, Int), Int] {
        def isDefinedAt(v: (Int, Int)): Boolean = ???
        def apply(v: (Int, Int)): Int = ???
      }

    println(v.isDefinedAt(10, 1))
    println(v.isDefinedAt(10, 0))

    trait Printer {
      def print(str: String): Unit
    }

    val printer: Printer = str => println(str)

    printer.print("Hello")

  }

}
