// Lightweight way of defining classes
class Person(var name: String, var vocation: String)
class Book(var title: String, var author: String, var year: Int)
class Movie(var name: String, var director: String, var year: Int)

// New instance of a class
// Used to have to use the "new" keyword
val p = Person("John", "Trumpet Player")

// Properties are mutable unless defined as vals
def changeInstanceProperties(): Unit = {
  p.name = "Joseph"
  p.vocation = "French Horn Player"
}

// Class with fields and methods
class PersonFieldsAndMethods(var firstName: String, var lastName: String):
  println("Initialization has begun")
  val fullName = s"$firstName $lastName"

  // class method
  def printFullName(): Unit = {
    println(fullName)
  }


val anotherP = PersonFieldsAndMethods("John", "Doe")

// Class with default parameters
class Socket(val timeout: Int = 5_000, val linger: Int = 5_000):
  override def toString =  s"timeout: $timeout, linger: $linger"

// Can used named parameters when declaring new instance
val aSocket: Socket = Socket(timeout = 10_000, linger = 10_000)

@main def output() = {
  // println(aSocket.timeout)
  print(aSocket.timeout, aSocket.linger)
}