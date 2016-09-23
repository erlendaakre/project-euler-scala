//counts the number of circular primes (17 - 71) below 1'000'000 (bit slow - 3 seconds)

val primeStream: Stream[Int] = 2 #:: Stream.from(3, 2).filter(i => primeStream.takeWhile(j => j * j <= i).forall(k => i % k > 0))
val primes = scala.collection.immutable.HashSet() ++ primeStream.takeWhile(p => p < 1000000)
val rot = (s:Seq[Int], i:Int) => s.drop(i) ++ s.take(i)
val rotations = (n:Int) => { val l = n.toString.map(_.asDigit); l.indices.map(rot(l,_).mkString.toInt).toSet }

(2 to 1000000).filter(p => rotations(p).forall(primes.contains(_)) ).size