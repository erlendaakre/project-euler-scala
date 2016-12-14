val primes: Stream[Int] = 2 #:: Stream.from(3, 2).filter(i => primes.takeWhile(j => j * j <= i).forall(k => i % k > 0))
def pandigital(n: Int, digits: Int) = n.toString.length == digits && (1 to digits).forall(d => n.toString.contains(d.toString))

primes.takeWhile(p => p < 987654321).filter(pandigital(_,9)).max
// java.lang.OutOfMemoryError: GC overhead limit exceeded
