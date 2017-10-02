package com.au

import com.au.model.AdultWoman

fun main(args: Array<String>) {

    val miss = AdultWoman()

    miss.sayHello()
    val fullname = miss.getFullName("Johanna")

    println(fullname)
}