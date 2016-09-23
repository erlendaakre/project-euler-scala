// counts Lychrel numbers (reverse digits in n and add to n == palindromic in < 50 iterations) below 10'000 
def isLychrel(n: Int): Boolean = {
  def check(n: BigInt, it: Int): Boolean = {
    val a = n + BigInt(n.toString.reverse)
    if(it >= 49) false else if(a == BigInt(a.toString.reverse)) true else check(a, it+1)
  }
  check(n, 1)
}
(1 until 10000).map(isLychrel).count(_ == false)