@main def output() = 
  println("-- STANDARD FOR LOOPS --")
  // For loops
  val ints: List[Int] = List(1, 2, 3, 4, 5)
  for int <- ints do println(int)

  println("\n-- IFS IN FOR LOOPS --")
  // If statements in for loops (guards)
  // Print all ints greater than 2
  for 
    int <- ints
    if int > 2
  do
    println(int)

  println("\n-- FOR LOOPS AS EXPRESSIONS --")
  // For expressions
  val doubles: List[Int] = for i <- ints yield i * 2
  println(doubles)