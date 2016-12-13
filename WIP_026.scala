val mc = new java.math.MathContext(50)

def findLargestRecurringCycle(s: String) = {
  
}

def recurringCycleLength(n: BigDecimal) = {
  val s = n.toString().replace("0.", "")
  println(s"length: $n = $s")
}

val d = (1 to 10).map(BigDecimal(1, mc) / _).foreach(recurringCycleLength)
