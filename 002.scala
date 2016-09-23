// sum of even numbered fibonacci numbers <= 4 million
def fibsum() = {
  def loop(c: Long, n: Long, s: Long): Long = if (c > 4000000) s else loop(n, c + n, if(c % 2 == 0) s + c else s )
  loop(0, 1, 0)
}