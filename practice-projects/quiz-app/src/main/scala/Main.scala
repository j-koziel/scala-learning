import scala.io.StdIn.readLine
import util.control.Breaks._

class Quiz(questions: Array[String], correctAnswers: Array[String]):
  var usersScore: Int = 0
  val usersAnswers: Array[String] = displayQuestionsAndGetAnswers()

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



  def checkAnswers(): Unit = {
    for answer <- usersAnswers do {
      breakable {
        if (answer != this.correctAnswers[0]) then {
          break
        } else {
          this.usersScore += 1
        }

      }
    }
    
    println(s"You completed the quiz with a score of $this.usersScore out of $this.correctAnswers.length")
  } 





@main def Main: Unit = 
  val quiz = Quiz(Array("How old are you?", "What is your name?", "Please help me?"), Array("17", "Bro", "No"))
