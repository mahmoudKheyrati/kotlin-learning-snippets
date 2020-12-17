package tinyTests


class RefTest {
    val name = "mahmoud"
    val age = 19
    val isOk = true

    fun sayHello() {
        println("hello bruh")
    }

    fun fuck(value: Int): String {
        return "Ref: $value"
    }
}

fun main() {
    val clazz = RefTest::class.java
    clazz.methods.forEach {
        println(it.name)
    }

    @Suppress("DEPRECATION")
    val instance = clazz.newInstance()

    clazz.getMethod("sayHello").invoke(instance)
    println(clazz.getMethod("fuck", Int::class.java).invoke(instance, 85))

}