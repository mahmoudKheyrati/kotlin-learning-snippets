package book

fun main() {
    Outer().show()


}

class Outer {
    fun show() {
        println("outer show")
        Inner().show()
    }

    fun outerFunction() {
        println("in another function that inner class wanna call")
    }

    inner class Inner {
        fun show() {
            println("Inner show")
            this@Outer.outerFunction()
        }
    }
}