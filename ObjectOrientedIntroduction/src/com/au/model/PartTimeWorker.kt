package com.au.model

/**
 * implementation / inheritance of a normal class
 */
class PartTimeWorker : Worker() {

    override fun workingDays(): List<String> = listOf("Monday", "Wednesday", "Thursday")

    override fun sayHello() {
        super.sayHello()
        println("BTW I am a part time worker")
    }

}