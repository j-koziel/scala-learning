@main def output() = 
  println("-- IF STATEMENT --")
  // If statements (they can also be used expressions)
  val x: Int = 10

  if x < 0 then
    println("zero")
  else if x == 0 then
    println("zero")
  else 
    println("positive")

  println("-- IF STATEMENT AS EXPRESSION --")
  // Can be used as an expression
  val a = 5
  val b = 3
  val y = if a < b then a else b
  println(y)