import org.scalatest.{FlatSpec, Matchers}

object LazyEvaluation extends FlatSpec with Matchers {
  val builder = new StringBuilder
  val x: Int = { builder += 'x'; 1 }
  lazy val y: Int = { builder += 'y'; 2 }
  def z: Int = { builder += 'z'; 3 }

  def main(args: Array[String]): Unit = {

    println(z + y + x + z + y + x)

    println(builder.result())
  }

}