object TermsAndTypes{

  def gcdIterative(a:Int, b:Int) :Int = {
    var A = a
    var B = b
    var tempResult = 0
    while (b != 0) {
      tempResult = A % B
      A = B
      B = tempResult
    }
    A
  }
  def sumTheNumbers():Int = {
    4
  }
  def sayHello():String = {
    "Hello, Scala!"
  }
  def main(args: Array[String]): Unit = {
    println(sumTheNumbers());
    println(sayHello())
  }
}
