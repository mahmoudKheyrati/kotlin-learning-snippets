package interfaces
// sam abbreviate of Single Abstract method

fun interface Clickable {
    fun click(data: String)
}

class Circle : Clickable {
    // you can use as normal interface
    override fun click(data: String) {
        println("clicking the circle with data: $data")
    }

}

fun main() {
    // normal usage
    val clickable = object :Clickable{
        override fun click(data: String) {
            println("performing click")
        }
    }
    // you can simplify it by:
    // the same functionality as above approach but much easier and much more readable
    val clickable2 = Clickable { data -> println("the data is : $data") }

    clickable.click("data")
    clickable2.click("DATA")
}


