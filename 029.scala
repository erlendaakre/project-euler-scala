// finds number of distinct terms in a sequence of integer combinations where 2 <= a <= 100 and 2 <= b <= 100
(for( a <- (2 to 100); b <- (2 to 100)) yield (BigInt(a).pow(b))).distinct.size