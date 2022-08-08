object Test extends App {

  val t: Array[String] = args

  println(t.mkString)

  import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

  sealed trait Foo
  case class Bar(xs: Vector[String]) extends Foo
  case class Qux(i: Int, d: Double) extends Foo

  val json = """{"Qux":{"i":13}}"""

  val decodedFoo: Either[Error, Foo] = decode[Foo](json)

  decodedFoo match {
    case Left(value) => println(s"There is some error: $value")
    case Right(value) =>  println(value)
  }

  //  println(decodedFoo)


}
