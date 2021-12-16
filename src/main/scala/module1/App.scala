package module1
import scala.util.control.Breaks._
import module1.list.List

object App {

  def main(args: Array[String]): Unit = {

    val l = List(1, 2, 3)
    l.mkString(';')
    l.cons(0).mkString(';')

    // // missing parameter type
    // l.map(el => el.toString).mkString(';')

    l.reverse.mkString(';')

    l.filter(el => el < 2 ).mkString(';')


    // def doomyFunc(a: String) = {
    //   Thread.sleep(1000)
    //   println(a)
    // }

    // val doomyFuncWithLoggingTime: String => Unit = hof.logRunningTime(doomyFunc)

    // val v: PartialFunction[(Int, Int), Int] = {
    //   case (x, y) if y != 0 => x / y
    // }

    // val v2: PartialFunction[(Int, Int), Int] =
    //   new PartialFunction[(Int, Int), Int] {
    //     def isDefinedAt(v: (Int, Int)): Boolean = ???
    //     def apply(v: (Int, Int)): Int = ???
    //   }

    // println(v.isDefinedAt(10, 1))
    // println(v.isDefinedAt(10, 0))

    // trait Printer {
    //   def print(str: String): Unit
    // }

    // val printer: Printer = str => println(str)

    // printer.print("Hello")

  }

}
