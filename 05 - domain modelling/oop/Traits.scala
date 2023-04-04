
// Traits are the primary tool of decomposition in scala... not classes
// They can contain abstract interfaces and provide concrete implementations
trait Showable:
  def show: String
  def showHtml = "<p>" + show + "</p>"

class Document(text: String) extends Showable:
  def show = text

val exampleDoc: Document = new Document("The text to be shown")

// Abstract members:
// abstract methods
// abstract value definitions
// abstract type members
// abstract givens (scala 3 only)

@main def ouput(): Unit = {
  val shown = exampleDoc.showHtml
  println(shown)
}