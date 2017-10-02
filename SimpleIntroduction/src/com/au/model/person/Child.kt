package com.au.model.person

class Child(val Name : String) {

    /**
     * Kotlin / string templating
     */
    fun displayName() {
        println("Child's name : ${Name}")
    }

    fun displayWithHighOrderFunc(func : (String) -> Unit) {
        func("Child's name (using a lambda) : ${Name}")
    }
}