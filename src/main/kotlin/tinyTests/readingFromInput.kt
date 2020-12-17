package tinyTests

import kotlin.concurrent.thread

fun main() {
    val (a,b) = readLine()!!.split(",")
    println("first: $a, second:$b")

    val lines = System.`in`.bufferedReader().lines()
    thread {

        for (line in lines) {
            println("### $line")
        }
    }
    println("code after forEach")

}