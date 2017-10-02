package com.au

import com.au.model.Adult
import com.au.model.Child

fun main(args: Array<String>) {
    println("Hello, World")

   /* val enguerrand = Adult()

    enguerrand.Name = "Enguerrand"
    println("Name of our adult is ${enguerrand.Name}")

    enguerrand.Name = "Steve"
    println("Name of our adult is ${enguerrand.Name}")

    enguerrand.displayName()

    val mike = Child("mike")

    mike.displayName()

    mike.Name = "Steve"

    mike.displayWithHighOrderFunc(::lambda)*/
}

fun lambda(str : String) : Unit {
    println(str)
}