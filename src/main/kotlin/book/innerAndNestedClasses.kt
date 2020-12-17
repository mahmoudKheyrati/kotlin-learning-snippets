package book

class OuterClass{
    val name = "mahmoud"
    class NestedClass(){
        fun nest() {
            println("in nested:")
        }
    }

    inner class InnerClass(){
        val name= "ahmad"
        fun displayInner() {
            println("in inner : ${this@OuterClass.name} -> $name" )
        }
    }
}

fun main() {
    val outer = OuterClass()
    outer.InnerClass().displayInner()

    val outer2 = OuterClass.NestedClass()
    outer2.nest()
}

