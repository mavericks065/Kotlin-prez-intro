package com.au.model

/**
 * Public by default
 */
interface Person {
    fun displayName()
    fun getFullName(firstName: String = "", lastname: String = "") : String

    fun sayHello() {
        println("Hello OCTO Oz")
    }
}