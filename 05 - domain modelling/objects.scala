// So, in Scala an object is simply just a class with only a single instance
// defined like this:
object StringUtils:
  def truncate(s: String, length: Int): String = s.take(length)
  def containsWhitespace(s: String): Boolean = s.matches(".*\\s.*")
  def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isEmpty

// This is a good way to declare all your functions in a single namespace
// Similar to how static methods are accessed on classes in Java, JS or python


// Objects can also have fields, like this:
object MathConstants:
  val PI = 3.14
  val E = 2.71828

@main def output() = {
  println("-- OBJECTS --")
  println(StringUtils.truncate("Chuck Bartowski", 5))
  println(MathConstants.PI)
}

