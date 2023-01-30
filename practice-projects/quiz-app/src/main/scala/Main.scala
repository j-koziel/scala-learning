import scala.io.StdIn.readLine

val questions: Array[String] = Array("How old is Joe Biden?", "What is the capital of Argentina?", "What year did the US host their first Olympic games?")
val answers: Array[String] = Array("80", "Buenos Aires", "1904")
var score: Int = 0

def checkAnswer(correctAnswer: String, usersAnswer: String): Boolean = {
  if usersAnswer != correctAnswer then
    return false
  
  return true

}

def askQuestionsAndCheckAnswers(questions: Array[String]): Unit = {
  for question <- questions do
    println(question)
    val usersAnswer: String = readLine("Please enter your answer -> ")

    if checkAnswer(answers(questions.indexOf(question)), usersAnswer) then
      println("That is correct, well done!")
      score += 1
    else 
      println("Looks like you got it wrong, please try again. :(")
}



@main def hello: Unit = 
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"
