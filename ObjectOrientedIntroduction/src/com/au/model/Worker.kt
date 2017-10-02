package com.au.model

/**
 * "open" to be able to extend it
 */
open class Worker : Person {
    var firstname = ""
    var lastname = ""

    override fun displayName() {
        println("Worker's name is ${firstname}")
    }

    override fun getFullName(firstName: String, lastname: String): String = firstName.plus(" ").plus(lastname)

    open fun workingDays() : List<String> {
        throw UnsupportedOperationException("not implemented")
    }

}