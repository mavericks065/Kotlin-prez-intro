package com.au.model

/**
 * implementation / inheritance of a normal class
 */
class PartTimeWorker(var nbOfHours: Int = 12) : Worker() {

    override fun workingDays(): List<String> = listOf("Monday", "Wednesday", "Thursday")

    override fun sayHello() {
        super.sayHello()
        println("BTW I am a part time worker but I work $nbOfHours per day")
    }
}