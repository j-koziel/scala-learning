// Base class which needs constructor arguments
// This was mainly used in older versions of scala
// abstract class Pet(name: String):
//   def greeting: String
//   def age: Int
//   override def toString = s"My name is $name, I say $greeting, and I'm $age"

// class Dog(name: String, var age: Int) extends Pet(name):
//   val greeting = "Woof"

// val d = Dog("Fido", 1)

// Trait parameters in scala 3 are da wae
trait Pet(name: String):
  def greeting: String
  def age: Int
  override def toString = s"My name is $name, I say $greeting, and I am $age"

class Dog(name: String, var age: Int) extends Pet(name):
  val greeting = "Woof"

val d: Dog = Dog("Yuki", 1)

@main def output() = {
  println(d)
}

// Traits.scala are more flexible compared to abstract classes
// You can mix multiple traits but only extend one class
// Rule of thumb: use classes to create instances of a certain type
// Use traits when decomposing and reusing behaviour