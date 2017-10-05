package com.au.model

/**
 * PUBLIC by default
 * "final" by default
 * multiple implementation
 */
class AdultWoman : Person, Woman {

    override fun sayHello() {
        super<Person>.sayHello()
        super<Woman>.sayHello()
    }

    override fun displayName() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * "final" by default
     */
    override fun getFullName(firstName: String, lastname: String): String = firstName.plus(" ").plus(lastname)
}
