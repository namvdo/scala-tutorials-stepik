object ClassesVsCaseClasses {
  val aliceAccount = new BankAccount
  aliceAccount.deposit(100)
  val c3: Note = Note("C", "three", 8)

  def main(args: Array[String]): Unit = {
    println(aliceAccount.withdraw(10))
    println(c3.name)
  }
}