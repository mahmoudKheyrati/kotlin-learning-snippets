package function

internal class OverloadTestClass{
    @JvmOverloads
    fun doSomething(name: String = "mahmoud", age: Int = 10) {
        println(name)
        println(age)
    }
}
fun main() {
    println("hello")

}