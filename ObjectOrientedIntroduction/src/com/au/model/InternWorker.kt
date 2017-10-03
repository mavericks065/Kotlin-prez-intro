package com.au.model

open class InternWorker(val school: String) : Worker() {

    override fun workingDays(): List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

    override fun sayHello() {
        super.sayHello()
        println("BTW I am an intern worker so I LOVE to work")
    }

    open fun isSuccessfull() : Boolean = throw UnsupportedOperationException("Don't know yet")
}