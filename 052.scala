// finds the smallest integer n, where 2n, 3n, 4n, 5n, and 6n contain the same digits
def sameDigits(n: Int, multipliers: Int): (Int,Boolean) = {
  val l = (1 to multipliers).map(n * _)
  (n, l.forall(f => f.toString.map(_.asDigit).toSet == l.head.toString.map(_.asDigit).toSet))
}
(1 to 1000000).view.map(sameDigits(_,6)).find(_._2)