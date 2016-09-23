// sum of all the multiples of 3 or 5 below 1000
(1 until 1000).view.filter(n => n % 3 == 0 || n % 5 == 0).reduce(_ + _)
