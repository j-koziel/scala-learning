val i: Int = 5

val day = i match {
  case 0 => "Monday"
  case 1 => "Tuesday"
  case 2 => "Wednesday"
  case 3 => "Thursday"
  case 4 => "Friday"
  case 5 => "Saturday"
  case 6 => "Sunday"
  case _ => "invalid day"
}
  
@main def output() = {
  println(day)
}
