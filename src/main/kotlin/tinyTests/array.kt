package tinyTests

import java.util.*

fun main() {
    val empty = emptyArray<Int>()
    val arrayWithConstructor = Array<Int>(5){index -> index*index }
    println("empty = ${empty.contentToString()}")
    println("arrayWithConstructor = ${arrayWithConstructor.contentToString()}")

    println(arrayOfNulls<Int>(10).contentToString())

}