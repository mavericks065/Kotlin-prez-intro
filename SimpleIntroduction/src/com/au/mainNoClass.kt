package com.au

fun main(args: Array<String>) {
    println("Let's play")

    val q = Question()

    println(q.Question)
    q.Answer = "1969"

    q.displayAnswer()

    val message = if (q.Answer.equals(q.CorrectAnswer)) {
        "You are correct"
    } else {
        "Go on wikipedia :-P"
    }
    println(message)

    // how to handle null possibilities ?
    /*val question: Question? = null
    question.Answer = "1970"

    question?.displayAnswer()

    if (question?.Answer.equals(question?.CorrectAnswer)) { // null equals null
        println("You are correct")
    } else {
        println("Go on wikipedia :-P")
    }*/

}

class Question {
    var Answer:String? = ""
    val CorrectAnswer = "1969"
    var Question = "In what year did we land on the moon ?"

    fun displayAnswer() {
        println("You said it was in $Answer")
    }
}