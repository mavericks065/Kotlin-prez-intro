package com.au.model.person

class Child(val name: String) {

    /**
     * Kotlin / string templating
     */
    fun displayName() {
        println("Child's name : $name")
    }

    fun displayWithHighOrderFunc(func : (String) -> Unit) {
        func("Child's name (using a lambda) : $name")
    }
}