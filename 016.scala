// finds the sum of the digits in 2^1000
BigInt(2).pow(1000).toString.toList.map(_.asDigit).sum
