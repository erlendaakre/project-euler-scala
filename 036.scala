// sum of numbers up to 1 million where n is palindrome in base 10 and base 2
(1 to 1000000).filter(n => n.toString == n.toString.reverse && n.toBinaryString == n.toBinaryString.reverse).sum