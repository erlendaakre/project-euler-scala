val mc = new java.math.MathContext(50)

def findRecurringCycle(s: String): String = {
  val d = (1 to s.length/2)

  "woop"
}

def recurringCycleLength(n: BigDecimal) = {
  println(s"length: $n")
  findRecurringCycle(n.toString().replace("0.", "")).length
}

val d = (1 to 10).map(BigDecimal(1, mc) / _).foreach(recurringCycleLength)
