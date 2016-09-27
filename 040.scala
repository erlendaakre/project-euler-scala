// finds the product of the digits at position 1,10,100,1000,10000,100000,1000000 in a concatenated string of all natural numbers
val d = "." + (1 to 1000000).map(_.toString).mkString
List(1,10,100,1000,10000,100000,1000000).map(d(_).asDigit).product
