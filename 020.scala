// finds the sum of the digits in the factrorial 100!
(1 to 100).map(BigInt(_)).reduce(_ * _).toString.toList.map(_.asDigit).sum