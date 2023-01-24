import java.time.*

// Auxillary Constructors
// A class can have multiple constructors so that
// consumers can make new instances in different ways

// Example:
// 1) Primary constructor
class Student(var name: String, var govtId: String):
  private var _applicationDate: Option[LocalDate] = None
  private var _studentId: Int = 0

  // 2) Constructor for when a student has completed their application
  def this(name: String, govtId: String, applicationDate: LocalDate) = {
    this(name, govtId)
    _applicationDate = Some(applicationDate)
  }

  // 3) Constructor for when a student is approved and holds a
  // student ID
  def this(name: String, govtId: String, studentId: Int) = {
    this(name, govtId)
    _studentId = studentId
  }

val student1 = Student("Mary", "123")
val student2 = Student("John", "456", LocalDate.now)
val student3 = Student("Bob", "789", 456)


@main def output() = {
  println(student1.name)
  println(student2.name)
  println(student3.name)
}
