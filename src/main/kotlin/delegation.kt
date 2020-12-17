

open class Super(){
    fun superFunction(){

    }
}

interface SecondSuper{
    fun secondSuperFunction(){
        println("implementaion in second super function in Interface")
    }
}

class Child(val input: SecondSuper) : SecondSuper by input, Super() {
    // comment this overridden function to see the difference
    override fun secondSuperFunction() {
        println("middle proccessing in the class which delegates SeconSuper")
        super.secondSuperFunction()
        println("after calling super in the middle ")
    }
}

fun main() {
    val child = Child(object : SecondSuper {
        override fun secondSuperFunction() {
            println("object before super")
            super.secondSuperFunction()
            println("object after super")
        }
    })

    child.secondSuperFunction()
}
