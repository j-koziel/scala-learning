import scala.io.StdIn.readLine

@main def helloInteractive() = 
  println("Please enter your name:")
  val name = readLine()

  println("Hello, " + name + "!")

// Simple example of user input
// Import the readLine function from scala library
// Whatever is returned from readLine is the value stored in "name"
// name is immutable as it is declared with "val"

