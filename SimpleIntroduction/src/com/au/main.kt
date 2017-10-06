package com.au

import com.au.model.person.Adult
import com.au.model.person.Child

fun main(args: Array<String>) {
    println("Hello OCTO Oz!!")

    val enguerrand = Adult()

     enguerrand.name = "Enguerrand"
     println("name of our adult is ${enguerrand.name}")

     enguerrand.name = "Steve"
     println("name of our adult is ${enguerrand.name}")

     enguerrand.displayName()

     val mike = Child("mike")

     mike.displayName()

//     mike.name = "Steve"

     mike.displayWithHighOrderFunc(::lambda)
}

fun lambda(str : String) {
    println(str)
}