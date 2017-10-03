package com.au.model

open class SuccessedInternWorker(school: String) : InternWorker(school) {

    override fun workingDays(): List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

    override fun sayHello() {
        super.sayHello()
        println("BTW I am an intern worker coming from $school but my end of year report is going to rock !!")
    }

    override fun isSuccessfull() : Boolean = true
}