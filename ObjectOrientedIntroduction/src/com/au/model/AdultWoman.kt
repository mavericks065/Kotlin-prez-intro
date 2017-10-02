package com.au.model

class AdultWoman : Person, Woman {
    override fun sayHello() {
        super<Person>.sayHello()
        super<Woman>.sayHello()
    }

    override fun displayName() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFullName(firstName: String, lastname: String): String {
        return firstName.plus(" ").plus(lastname)
    }
}