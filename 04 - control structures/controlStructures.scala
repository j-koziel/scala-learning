// If statements (they can also be used expressions)

val x: Int = 10

if x < 0 then
  println("zero")
else if x == 0 then
  println("zero")
else 
  println("positive")


// Can be used as an expression
val a = 5
val b = 3
val y = if a < b then a else b


// For loops
val ints: List[Int] = List(1, 2, 3, 4, 5)
for int <- ints do println(int)

// If statements in for loops (guards)
// Print all ints greater than 2
for 
  int <- ints
  if int > 2
do
  println(int)


// For expressions
val doubles = for i <- ints yield i * 2