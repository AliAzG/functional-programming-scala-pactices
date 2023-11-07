def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
  @annotation.tailrec
  def go(n: Int): Boolean = {
    if (n >= (as.length-1))  true
    else if (gt(as(n), as(n+1)))  false
    else go(n+1)
  }
  go(0)
}

val array1 = Array(1, 2, 3, 4, 5)
val array2 = Array("apple", "banana", "cherry")
val array3 = Array(5.6, 4.3, 2.1)

def greaterThan(a: Int, b: Int): Boolean = a > b

val sorted1 = isSorted(array1, greaterThan)
// val sorted2 = isSorted(array2, greaterThan)
// val sorted3 = isSorted(array3, greaterThan)


println(sorted1)