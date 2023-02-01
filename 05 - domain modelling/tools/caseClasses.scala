// A case class is used to model data structures where the data can not be mutated

case class Person(name: String, relation: String)

// Instances of case classes
val christina = Person("christina", "niece")

// christina.name = "Fred" // this would be an error


// Features of case classes
// The compiler generates an unapply method which allows for pattern matching
def unapplyMethodDemo() = {
  christina match
    case Person(n, r) => println("name is " + n)
}

// equals method generated by the compiler
val hannah = Person("Hannah", "niece")
// hannah == christina would be false

// built in copy method
case class BaseballTeam(name: String, lastWorldSeriesWin: Int)

val cubs1908 = BaseballTeam("Chicago Cubs", 1908)
val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2016) // named parameters are pretty cool :)

@main def output() = {
  // built in toString method
  println(christina)
  
  // unapply method demo
  unapplyMethodDemo()
}