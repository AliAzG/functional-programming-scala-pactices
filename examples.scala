def findFirst[A](as: Array[A], p: A => Boolean): Int = {
  @annotation.tailrec
  def loop(n: Int): Int = {
    if (n >= as.length) -1
    else if (p(as(n))) n
    else loop(n + 1)
  }
  loop(0)
}

println(findFirst(Array(7, 9, 13), (x: Int) => x == 9)) // function literal or anonymous function