// finds all n digit numbers that are also powers of n. e.g. 16807= 7^5
// a max = 9 because 10^n is always n+1 digits. b max = 22 because 9^22 is a 21 digit number.
val powers = for( a <- (1 to 9); b <- (1 to 22)) yield (BigInt(a).pow(b), a, b)
powers.count(p => p._1.toString.length == p._3)