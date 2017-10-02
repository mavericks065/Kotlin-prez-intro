package com.au.model.person

class Adult {
    var Name = ""

    /**
     * Java Style String
     */
    fun displayName(sentence: String = "Adult's name : ") {
        println(sentence + Name)
    }
}