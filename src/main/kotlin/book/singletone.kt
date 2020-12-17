package book

object KotlinSingleton {
    val username = "mahmoud"
    val password = "12344"
    fun firstFunction() {}
    fun secondFunction() {}
}

fun main() {
    println(KotlinSingleton.username)
    println(KotlinSingleton.password)
    KotlinSingleton.firstFunction()
    KotlinSingleton.secondFunction()
}