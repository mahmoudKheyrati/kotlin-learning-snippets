package interfaces
class HttpConnection : Closable{
    override val name: String = "http-client"
    override var isClosed: Boolean = false


    override fun canClose(): Boolean {
        return !super.canClose()
    }
}

class CustomFileReader(): Closable{
    override val name: String = "custom-file-reader"
    override var isClosed: Boolean = false


    override fun canClose(): Boolean {
        println("canClose function called ")
        return true
    }
}

fun main() {
    val connection = HttpConnection()
    println(connection.name)
    println(connection.isClosed)
    println(connection.canClose())
    connection.close()

    println("-".repeat(80))

    val fileReader = CustomFileReader()
    println(fileReader.name)
    println(fileReader.isClosed)
    println(fileReader.canClose())
    fileReader.close()
}