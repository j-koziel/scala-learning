trait GreetingService:
  def translate(text: String): String
  def sayHello = translate("Hello")

trait TranslationService:
  def translate(text: String): String = "..."

trait Showable:
  def show: String
  def showHtml = "<p>" + show + "</p>"

trait ComposedService extends GreetingService, TranslationService

// Traits are great for modularizing our components and to describe interfaces... soon enough however, we will need
// instances of our traits

// When designing sofware in Scala its helpful to consider using classes at the leafs (edges) of our inheritance model
// This is even more the case in Scala 3 where traits can now take parameters... less of a need for classes

class MyService(name: String) extends ComposedService, Showable:
  def show = s"$name says $sayHello"

val s1: MyService = MyService("Service 1")

// Now due to subtyping our instance can be used everywhere where the traits are expected
val s2: GreetingService = s1
val s3: TranslationService = s1
val s4: Showable = s1


// Possibility to extend other classes
class Person(name: String)
class SoftwareDEveloper(name: String, favouriteLang: String) extends Person(name)
// However, due to traits being the first means of decomposition we should go for, it is not recommended to extend
// classes from different files

// Open classes (scala 3 only)
// This reqires that during the design process, class extensions need to be deliberately planned
open class Person1(name: String)


@main def output(): Unit = {
  println(s1.show)
}
