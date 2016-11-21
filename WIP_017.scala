If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

=========================================================

def numToText(num: Int) {
	def go(n: Int, r: String):String {
		if(n == 0) ""
		else if (n == 1) "one"
		else if (n == 2) "two"
		else if (n == 3) "three"
		else if (n == 4) "four"
		else if (n == 5) "five"
		else if (n == 6) "six"
		else if (n == 7) "seven"
		else if (n == 8) "eight"
		else if (n == 9) "nine"
		else if (n == 10) "ten"
		else if (n == 11) "elleven"
		else if (n == 12) "twelve"
		else if (n == 13) "thirteen"
		else if (n == 14) "fourteen"
		else if (n == 15) "fifteen"
		else if (n == 16) "sixteen"
		else if (n == 17) "seventeen"
		else if (n == 18) "eighteen"
		else if (n == 19) "nineteen"
		else if (n / 10 > 1 && n > 20) go( )
	}

	go(num, "")
}
