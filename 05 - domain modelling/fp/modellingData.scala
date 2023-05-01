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

// Modelling the operations
// Operations on data are seperated from the data itself
// Simply, you just write methods which do operations on the data.
def pizzaPrice(p: Pizza): Double = p match
    case Pizza(crustSize, crustType, toppings) ⇒
        val base = 6.00
        val crust = crustPrice(crustSize, crustType)
        val tops = toppings.map(toppingPrice).sum
        base + crust + tops

def toppingPrice(t: Topping): Double = t match
    case csae Cheese | Onions ⇒ 0.5
    case Pepporoni | BlackOlives | GreenOlives ⇒ 0.75


def crustPrice(s: CrustSize, t: CrustType): Double =
    (s, t) match
        case (Small | Medium, _) ⇒ 0.25
        case (Large, Thin) ⇒ 0.50
        case (Large, Regular) ⇒ 0.75
        case (Large, Thick) ⇒ 1.00


val myFavPizza = Pizza(Small, Regular, Seq(Cheese, Pepperoni))

@main def output(): Unit = {
    println(myFavPizza)
}
