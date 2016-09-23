// Parses a file with names "N1", "N2",.. sum score of all names based on (character values, A = 1, B = 2, ..) and their position in sorted list
def score(name:String, pos:Int) = name.getBytes.map(_-64).sum * pos
io.Source.fromFile("names.txt").mkString.replace("\"","").split(",").sorted.zipWithIndex.map(a => (a._1, a._2+1)).map { case(n,p) => score(n,p) }.sum