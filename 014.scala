// finds the starting number of the longest Collatz sequence under 1 million
val collatz = (num: Long) => {
  def work(n: Long, length: Long): Long = {
    if(n == 1) length
    else if(n % 2 == 0) work(n/2, length+1)
    else work((n*3)+1, length+1)
  }
  work(num, 1)
}
(1 to 1000000).map(n => (n,collatz(n))).sortBy(_._2).last._1