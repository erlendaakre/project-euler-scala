// finds the sum of all primes below 2 million
val primes: Stream[Int] = 2 #:: Stream.from(3, 2).filter(i => primes.takeWhile(j => j * j <= i).forall(k => i % k > 0))
primes.takeWhile(p => p < 2000000).toList.map(n => BigInt(n)).sum