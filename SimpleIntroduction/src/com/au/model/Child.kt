package com.au.model

class Child(val Name : String) {

    fun displayName() {
        println("Child's name : " + Name)
    }

    fun displayWithHighOrderFunc(func : (String) -> Unit) {
        func("Child's name (using a lambda) : " + Name)
    }
}