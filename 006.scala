// finds the difference between the sum of the squares of numbers 1-100 and the square of the sum
BigInt((1 to 100).sum).pow(2) - (1 to 100).map(BigInt(_).pow(2)).sum