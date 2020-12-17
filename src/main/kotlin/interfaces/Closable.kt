package interfaces

interface Closable{
    val name : String
    var isClosed: Boolean
    fun close(){
        println("closing $name ...")
    }

    fun canClose(): Boolean {
        return true
    }
}