package lesson_monad

object monad {

  def main(arg: Array [String]): Unit = {
    class Lazy[+A](v: =>A){
      private lazy val internal = v
      def flatMap[B](f: (=> A) => Lazy[B]): Lazy[B] = f(internal) //
      def map[B](f: A => B): Lazy[B] = flatMap( x => new Lazy(f(x)))
      def get: A = internal
    }

    object Lazy{
      def apply[A]( v: =>A): Lazy[A] = new Lazy(v)
    }

    val someInt: Lazy[Int] = new Lazy({
      println("I must be lazy")
      100
    })

    val someString: Lazy[String] = someInt.flatMap(x => Lazy(s"""I am string = $x"""))

    println(someInt)
    println(someString)

    val result: Lazy[Int] = for {
      el1 <- Lazy(1)
      el2 <- Lazy(2)
      el3 <- Lazy(3)
    } yield el1 + el2 + el3

    println(result)

    println(someInt.get)
    println(someString.get)
    println(result.get)

    //left identity

    val func1 = {
      x: Int => Lazy(s"I am string -$x")
    }

    val r = Lazy(10).flatMap(e => func1(e))
    val r2 = func1(10)

    println(r)
    println(r2)
    println(r.get)
    println(r2.get)

  }
}
