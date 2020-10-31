object StandardLibrary{
  val cond: (Int, Int) => Boolean =  (a, b) => a <= b
  def insert(x: Int, xs: List[Int]): List[Int] =
    xs match {
      case List() => x :: Nil
      case y :: ys =>
        if (cond(x, y)) x :: y :: ys
        else y :: insert(x, ys)
    }

  def main(args: Array[String]): Unit = {
    println(insert(4, 1::8::Nil))
  }
}