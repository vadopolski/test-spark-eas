import scala.io.{BufferedSource, Source}
import scala.util.Using


object HomeWork1 extends App {
  case class InputCountries()


  import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._


  Using(Source.fromFile("src/main/resources/countries.json") ) { src =>
    val parsed = decode[RootInterface](src.mkString)

  }


  val source: BufferedSource = Source.fromFile("src/main/resources/countries.json")

  println(source.mkString)



}

