// finds the largest prime factor for 600851475143
def bigIterator(start: BigInt, end: BigInt, step: BigInt = 1) = Iterator.iterate(start)(_ + step).takeWhile(_ <= end)
def maxFactor(number: BigInt, biggest: BigInt): BigInt = {
  val it = bigIterator(BigInt(2), number, BigInt(1))
  while (it.hasNext) {
    val n = it.next
    if(number % n == 0) return maxFactor(number / n, biggest max n)
  }
  biggest
}
maxFactor(BigInt("600851475143"), 0)