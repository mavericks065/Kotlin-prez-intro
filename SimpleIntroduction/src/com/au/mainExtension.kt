package com.au

fun main(args: Array<String>) {
    val text = "String With    multiple \t whitespace"
//    println(replaceMultipleWhiteSpace(text))
    // Function extension of String
//    println(text.replaceMultipleWhiteSpaceEx())
    println(text add " test infix")
}


fun replaceMultipleWhiteSpace(value: String) : String {
    val regex = Regex("\\s+")
    return regex.replace(value, " ")
}


fun String.replaceMultipleWhiteSpaceEx() : String {
    val regex = Regex("\\s+")
    return regex.replace(this, " ")
}

infix fun String.add(str: String) : String = this.plus(str)
