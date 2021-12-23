package module1
import scala.util.control.Breaks._
import module1.list.{List, incList, shoutString}
import module1.opt.Option

object App {

  def main(args: Array[String]): Unit = {

    println("-----option-------")
    val option1 = Option(1)
    val option2 = Option(2)
    println(option1.isEmpty)
    println(option1.get)
    println(option1.zip(option1,option2))

    println("-----list-------")
    val l = List(1, 2, 3)
    println(l.mkString(";"))
    println("cons: " + l.cons(0).mkString(";"))

     println("map: " + l.map(el => el + "a").mkString(";"))

    println("reverse: " + l.reverse.mkString(";"))

    println("filter: " + l.filter(el => el <= 2 ).mkString(";"))

    println("incList: " + incList(l).mkString(";"))
    val l1 = List("asd","qwewq","bvvc")
    println("shoutString: " + shoutString(l1).mkString(";"))


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
