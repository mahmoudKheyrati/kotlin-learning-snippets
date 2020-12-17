package tinyTests

import kotlin.jvm.Throws

fun main() {
    val a = "mahmoud"
    val b = "mahmoud"
    a eq b
    a req b

    // raw string

    val raw = """
        for ( i in "a"){
        
        }
    """.trimIndent()

    trimTest()

    println(raw)

}

fun trimTest() {
    val number = 143
    val string = """
        first
        second
        third
        $999.9
        ${'$'}$number
        
    """.trimIndent()


    println(string)
}

infix fun <T> T.eq(value: T) {
    if (this == value) println("OK")
    else println("Error")
}

infix fun <T> T.req(value: T) {
    if (this === value) println("OK")
    else println("Error")
}
