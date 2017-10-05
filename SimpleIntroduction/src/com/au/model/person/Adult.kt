package com.au.model.person

class Adult {
    var name = ""

    /**
     * Java Style String
     */
    fun displayName(sentence: String = "Adult's name : ") {
        println(sentence + name)
    }
}