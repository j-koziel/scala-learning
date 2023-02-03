import scala.io.StdIn.readLine
import util.control.Breaks._

class Quiz(questions: Array[String], correctAnswers: Array[String]):
  var usersScore: Int = 0

  def displayQuestionsAndGetAnswers(): Array[String] = {
    val answers: Array[String] = Array()
    for question <- this.questions do {
      var inputState: Boolean = true
      while inputState do {
        breakable {
          println(question)
          val answer = readLine("Please enter your answer -> ")

          if (answer == "") then {
            println("You have entered an invalid answer")
            break
          }
          answers :+ answer
          inputState = false
        } 
      }  
    }

    return answers
  }

  val usersAnswers = displayQuestionsAndGetAnswers()





@main def Main: Unit = 
  val quiz = Quiz(Array("How old are you?", "What is your name?", "Please help me?"), Array("17", "Bro", "No"))

def msg = "I was compiled by Scala 3. :)"
