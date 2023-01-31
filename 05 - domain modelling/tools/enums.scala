// Enums are scala 3 only
// They can be used to define a finite set of named values
// However they can be more flexible than that as can be seen in the fp section

// Basic unms can be used to define months of a year or directions like
// north east south west

// Pizza example:
enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions


val currentCrustSize = CrustSize.Small

// Enum values can be compared with ==
// if example:
def checkCurrentCrustSize(): Unit = {
  if currentCrustSize == CrustSize.Large then
    println("You get a prize!")
}

// match example
def matchCurrentCrustSize(): Unit = {
  currentCrustSize match
    case CrustSize.Small => println("small")
    case CrustSize.Medium => println("medium")
    case CrustSize.Large => println("large")
}

// Extra features
// enums can have good old params
enum Color(val rgb: Int):
  case Red extends Color(0xFF0000)
  case Green extends Color(0x00FF00)
  case Blue extends Color(0x0000FF)


// enums can even have members (fields and methods)
enum Planet(mass: Double, radius: Double):
  private final val G = 6.67300E-11 // The final keyword just means that this field will not be able to be mutated in subclasses
  def surfaceGravity = G * mass / (radius * radius)
  def surfaceWeight(otherMass: Double) = {
    otherMass * surfaceGravity
  }

  case Mercury extends Planet(3.303e+23, 2.4397e6)
  case Earth extends Planet(5.976e+24, 6.37814e6)

@main def output() = {
  println(Planet.Mercury)
}