import scala.math.*

class Circle (val radius: Double):
  def area: Double = Circle.calculateArea(radius)


object Circle:
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)


val circle1 = Circle(5.0)


// Example of an apply method
class Person:
  var name = ""
  var age = 0
  override def toString = s"$name is $age years old"


object Person:
  // One arg factory method 
  def apply(name: String): Person = 
    var p = new Person
    p.name = name
    p

  // Two arg factory method
  def apply(name: String, age: Int): Person = {
    var p = new Person
    p.name = name
    p.age = age
    p
  }
end Person

val joe = Person("Joe")
val fred = Person("Fred", 42)
//val joe: Person = Joe is 0 years old
//val fred: Person = Fred is 29 years old

@main def output(): Unit = {
  println(joe)
  println(fred)
}