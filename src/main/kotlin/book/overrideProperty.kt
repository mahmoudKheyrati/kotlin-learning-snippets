package book

@Suppress("LeakingThis")
open class Parent{
    open val foo: Int = 1
    init{
        println(foo)
    }
}
class Child: Parent() {
    override val foo: Int = 90
}

fun main() {
    Child()
}