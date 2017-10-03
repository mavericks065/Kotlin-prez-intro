package com.au.model

/**
 * Primary constructor below
 */
class FullTimeWorker(var nbOfHours: Int = 8) : Worker() {
     var company: String = "unknown"

    /**
     * Secondary constructor
     */
    constructor(nbOfHours: Int, company: String = "sel-employed") : this(nbOfHours) {
        this.company = company
    }

    override fun workingDays(): List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

    override fun sayHello() {
        super.sayHello()
        println("BTW I am a full time worker but I work $nbOfHours per day")
    }
}