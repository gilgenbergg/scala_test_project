class Fibo() {

  def withWhile(n: Long): Long = {
    var prev1 = 0
    var prev2 = 1
    var counter = 0

    while (counter < n) {
      val cur = prev1 + prev2
      prev1 = prev2
      prev2 = cur
      counter = counter + 1
    }
    prev1
  }

  def withRec(n: Long): Long = n match {
    case 0 | 1 => n
    case _ => withRec(n - 2) + withRec(n - 1)
  }

  def withTailRec(n: Long): Long = {
    @scala.annotation.tailrec
    def fib_tail(n: Long, a: Long, b: Long): Long = n match {
      case 0 => a
      case _ => fib_tail(n - 1, b, a + b)
    }
    fib_tail(n, 0 , 1)
  }
}
