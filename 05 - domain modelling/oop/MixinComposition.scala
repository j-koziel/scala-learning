// Mixin composition is when two traits are combined together to create one who trait
// Abstract definitions of methods are instantly matched to concrete implementations of the same methods.
trait GreetingService:
  def translate(text: String): String
  def sayHello = translate("Hello")

trait TranslationService:
  def translate(text: String): String = "..."

trait ComposedService extends GreetingService, TranslationService
// Here, the abstract definition of "translate" in GreetingService is automatically matched to the concrete definition
// of "translate" in TranslationService

@main def output(): Unit = {
  println("Hello")
}
