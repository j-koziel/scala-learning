// In FP the data and the operations which happen on the data are 2 seperate things.
// You are not forced to encapsulate both into a single class or construct


// In a pizza store
// Different alternatives can be identified using enums
enum CrustSize:
    case Small, Medium, Large

enum CrustType:
    case Thin, Thick, Regular

enum Topping:
    case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions

// Compound data
case class Pizza(
    crustSize: CrustSize,
    crustType: CrustType,
    toppings: Seq[Topping]
                )

val myFavPizza = Pizza(Small, Regular, Seq(Cheese, Pepperoni))

@main def output(): Unit = {
    println(myFavPizza)
}
