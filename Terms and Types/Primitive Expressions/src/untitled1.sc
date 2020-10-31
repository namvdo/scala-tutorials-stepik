object Fibonacci extends App {

  def gcdIterative(a:Int, b:Int) :Int = {
    var A = a
    var B = b
    var tempResult = 0
    while (a != 0 && b != 0) {
      tempResult = A % B
      A = B
      B = tempResult
    }
    A
  }

}