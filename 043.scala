// Find sum of all 0-9 pandigital numbers with a specific set of sub-string divisiblity properties
def f(n: String) = n.substring(1,4).toInt % 2 == 0 && n.substring(2, 5).toInt % 3 == 0 && n.substring(3,6).toInt % 5 == 0 && n.substring(4,7).toInt % 7 == 0 && n.substring(5,8).toInt % 11 == 0 && n.substring(6,9).toInt % 13 == 0 && n.substring(7,10).toInt % 17 == 0

List(0,1,2,3,4,5,6,7,8,9).permutations.map(_.mkString).filter(f).toList.map(_.toLong).sum
