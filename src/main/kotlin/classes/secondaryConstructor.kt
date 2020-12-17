package classes

import java.lang.Double.NaN


class Student(private val firstName: String, private val lastName: String, private val grade: Double) {
    // you should call primary constructor first
    constructor(fullName: String) : this(
        fullName.split("-")[0],
        fullName.split("-")[1],
        NaN
    ){
        println("second constructor called with $fullName")
    }

    init {
        // always run before secondary constructor
        println("init block ... ")
    }
    init {
        println("init block only for test ....")
    }

    override fun toString(): String {
        return "Student(firstName='$firstName', lastName='$lastName', grade=$grade)"
    }


}

fun main() {
    val student = Student("mahmoud","kehyrati",20.0)
    println(student)
    println("-".repeat(80))
    val student2 = Student("mahmoud-kheyrati")
    println(student2)


}