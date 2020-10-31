object ClassesVsCaseClasses{
  val aliceAccount = new BankAccount()
  val bobAccount   = new BankAccount()

  val c3     = Note
  val cThree = Note

  def main(args: Array[String]): Unit = {
    println(aliceAccount == bobAccount)
    print(c3 == cThree)
  }
}