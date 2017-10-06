package com.au

import com.au.model.FullTimeWorker
import com.au.model.User

fun main(args: Array<String>) {

//    val miss = AdultWoman()
//
//    miss.sayHello()
//    val fullname = miss.getFullName("Johanna")
//
//    println(fullname)

    val worker = FullTimeWorker()
    val erwan = User("erwan", "1234", worker)
    val thibaut = User("erwan", "1234", worker)

    if (erwan.equals(thibaut)) {
        println("erwan = thibaut")
    } else {
        println("nope")
    }
}