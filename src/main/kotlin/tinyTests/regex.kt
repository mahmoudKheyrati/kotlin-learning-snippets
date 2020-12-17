package tinyTests

import java.time.Instant

fun main() {
    val regex = Regex("[ab]")
    with(regex) {
        println(containsMatchIn("acccdb"))
    }
}