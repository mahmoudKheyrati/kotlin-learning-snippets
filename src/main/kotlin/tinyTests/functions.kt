package tinyTests

import intropability.StaticTest.Companion.age
import java.time.Duration
import java.time.Instant
import kotlin.system.measureTimeMillis

inline fun getLambda(a: (String) -> Int, b: (Int) -> String) {
    a("123")
    b(0)

}


fun main() {
    val start = Instant.now()
    getLambda({ s -> s.toInt() }, { i -> i.toString() })
    val end = Instant.now()
    println("time = ${Duration.between(start, end)}")


}

