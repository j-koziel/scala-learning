// Traits.scala are similar to interfaces in Java 8+
// They can contain abstract methods and fields (methods and fields which are implemented in the inherited class)
// Can also contain concrete methods and fields (methods and fields which are implemented in the trait itself)

// Example with just abstract methods 
trait Employee:
  def id: Int
  def firstName: String
  def lastName: String

// Example with both abstract and concrete fields/methods
trait HasLegs:
  def numLegs: Int
  def walk(): Unit
  def stop() = println("Stopped walking")

trait HasTail:
  def tailColor: String
  def wagTail() = println("Tail is wagging")
  def stopTail() = println("Tail is stopped")

// Class which extends both of these
class IrishSetter(val name: String) extends HasLegs, HasTail:
  val numLegs = 4
  val tailColor = "red"
  def walk() = println("I'm walking")
  override def toString = s"$name is a dog"


val dog: IrishSetter = IrishSetter("Big Red")

@main def output(): Unit = {
  println(dog)
}
