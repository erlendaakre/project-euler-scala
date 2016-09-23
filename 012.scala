// finds the first triangle number to have over five hundred divisors
val tri = (n: Int) => (1 to n).sum
val factorCount = (n: Int) => {
  val a = (1 to math.sqrt(n).toInt).toList.filter(n % _ == 0)
  val b = a.map(n / _)
  (if (math.sqrt(n) % 1 == 0) a ++ b.init else a ++ b).size
}
(1 to 20000 map tri).map(n => (n, factorCount(n))).find(_._2 > 500).get._1