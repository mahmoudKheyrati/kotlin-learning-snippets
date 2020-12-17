package dsl

import book.function
import java.lang.StringBuilder

data class Person(val name: String, val age: Int) {
    fun doSomething() {
        println("$name $age")
        println("do something . .. . ")
    }
}

fun main() {

    buildPerson {
        doSomething()
    }
}

fun buildPerson(action: Person.() -> Unit): Person {
    val person = Person("mahmoud", 19)
    person.apply(action)
    return person
}

