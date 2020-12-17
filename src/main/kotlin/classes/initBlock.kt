package classes

class Book(private var name: String, private var author: String, edition: Int) {
    /*

        During an instance initialization,
        the initializer blocks are executed in the same order
        as they appear in the class body, interleaved with the property initializers:

        you should be aware of the the position of your init blocks
     */


    val fullName = "$name - $author - $edition".also { println("generate fullName= $it") }

    init {
        name = name.toUpperCase()
        println("first init block .... upperCase name = $name")
    }

    init {
        author = author.toUpperCase()
        println("second init block ... upperCase author = $author")

    }

    val secondFullName = "$name - $author - $edition".also { println("generate SecondFullName= $it") }


}

fun main() {
    val cleanCode = Book("clean code", "uncle Bob", 1)
    println("-".repeat(80))
    println("cleanCode.fullName = ${cleanCode.fullName}")
    println("cleanCode.secondFullName = ${cleanCode.secondFullName}")
}
