// finds prime number 10'001
(1 to 110000).filter(n => !((2 until n-1) exists (n % _ == 0)))(10001)