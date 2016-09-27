// last 10 digits of the sum of 1 to 1000 to it's own power, e.g. 1^1, 2^2, 3^3,..., 1000^1000
(1 to 1000).map(n => BigInt(n).pow(n)).sum.toString.takeRight(10)
