/ /finds the sum of all the amicable numbers (sum of divisors a = b, and sum of divisors b = a) under 10'000
val factorSum = (n: Int) => (1 to n/2).toList.filter(n % _ == 0).sum
(1 to 10000).map(n => (n,factorSum(n))).filter(n => n._1 == factorSum(n._2) && n._1 != n._2).map(_._1).sum