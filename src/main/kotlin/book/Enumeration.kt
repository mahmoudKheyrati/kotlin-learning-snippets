package book

import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.lang.IllegalArgumentException

interface Doable{
    fun print()

}
enum class Months(val string: String , val nubmer : Int): Doable{
    January("jan", 1 ) {
        override fun print() {
            println("fuck jan")
        }
    },
    February("feb", 2 ) {
        override fun print() {
            println("fuck feb")
        }
    },
    March("mar", 3) {
        override fun print() {
            println("fuck march")
        }
    };
    fun something(){
        println("there we go: ${this.string}")
    }
}

fun main() {


    for (thing in Months.values()) {
        println("thing = ${thing.name} \t\t: ${thing.nubmer}")
    }
    println("-".repeat(40))

    println(Months.valueOf("February").string)
    try {
        println(Months.valueOf("february").string)
    } catch (e: IllegalArgumentException) {
        println("the value you requested does not found ")
        println(e.message)
    }
    Months.February.something()
    Months.January.print()
}