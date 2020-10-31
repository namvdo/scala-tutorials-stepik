import org.scalatest.{FlatSpec, Matchers}

object StandardLibrary extends FlatSpec with Matchers {

  def optionMap(x: Option[Int]) : Option[Int]= {
    x.map(value => value + 1)
  }

  def optionFilter(x: Option[Int]): Option[Int] = {
    /*filter the x values to return only even ones*/
    x.filter(value => value % 2 == 0)
  }

  def optionFlatMap(x: Option[Int]): Option[Int] = {
    /*use flatMap to return the option for x + 1*/
    x.flatMap(value => Option.apply(value + 1))
  }

  def main(args: Array[String]): Unit = {
    println(optionMap(Some(7)))
    println(optionMap(None))
    println(optionFilter(Some(5)))
    println(optionFilter(Some(6)))
    println(optionFlatMap(Some(4)))
    println(optionFlatMap(None))
  }

}