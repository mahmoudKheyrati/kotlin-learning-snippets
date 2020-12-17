package tinyTests

import kotlin.random.Random

fun main() {
    var result = 10
    result = result.coerceAtMost(5)
    println("result = $result")

}
inline infix fun < reified T> T.showType(value: Int){
    when(T::class){
        String::class -> println("T is a string")
        Int::class -> println("T is a Integer")
    }
    if (value is T) {
        println("value  a string ")
    }

}