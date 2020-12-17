package generic

inline fun <reified T> genericFunction(value: T ){
    println(value)
    println(T::class.java.methods.toList())

}


fun main() {
    genericFunction("hi")

}