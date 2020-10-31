object TermsAndTypes {

  def upperCaseMethod(): String = {
    "Hello, Scala!".toUpperCase
  }

  def absMethod(): Int = {
    -42.abs//invoke a method here to return an absolute value of the number
  }

  def main(args: Array[String]): Unit = {
    println(upperCaseMethod())
    println(absMethod())
  }

}