Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?


-------------- paths = last max perm times current

1x1 = 1 to 2 perm = 2				cells = 1
2x2 = 1 to 3 perm = 6				cells = 4
3x3 = 1 to 4 perm = 24				cells = 9
4x4				  = 120				cells = 16
5x5				  = 720
6x6				  = 5040
7x7				  = 40320
8x8				  = 362880
9x9				  = 3628800
10x10			  = 39916800
11x11			  = 

---- gives wrong results----
def pathcount(n: Int): BigInt = {
  def go(i: Int, last:BigInt): BigInt = if(i >= n) last else go(i+1, (i+2)*last)
  go(1, BigInt(2))
}

