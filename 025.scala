// finds the index of the first fibonacci number with 1000 digits
def fibIndexByDigits(digits: Int) = {
  @scala.annotation.tailrec def loop(c: BigInt, n: BigInt, i: Long): Long = if (c.toString.length >= digits) i else loop(n, c + n, i+1)
  loop(0,1,0)
}

fibIndexByDigits(1000)