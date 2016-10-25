// counts ways to to make up X amount of change given coins A,B,C..
def countChange(money: Int, coins: List[Int]): Int = {
  if(money < 0) 0
  else if(coins.isEmpty) if(money == 0) 1 else 0
  else countChange(money, coins.tail) + countChange(money - coins.head, coins)
}
countChange(200, List(1,2,5,10,20,50,100,200))
