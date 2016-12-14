// Finds the smallest triangle number that is also pentagonal and hexagonal and greater than 40755
def triangle(n: Long) = n*(n+1)/2
def pentagonal(n: Long) = n*(3*n-1)/2
def hexagonal(n: Long) = n*(2*n-1)

(1L to 1000000).map(triangle).intersect( (1L to 1000000).map(pentagonal)).intersect( (1L to 1000000).map(hexagonal) ).find(p => p > 40755).head
