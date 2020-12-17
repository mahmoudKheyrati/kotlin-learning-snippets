package book


fun main() {
    val netwrokConnector = NetwrokConnector()
    netwrokConnector.implemented()
    netwrokConnector.requestBody

}

interface onNetwrokConnect{
    val requestSize: Int
    val responseSize : Int

    val requestBody: String
    val responseBody: String

    fun validate(requestBody : String):Boolean
    fun start()
    fun end(isConnect: Boolean)
    fun implemented(){
        println("-- in implemented interface: ")
        println("-- interface with body")
    }
}

class NetwrokConnector: onNetwrokConnect{
    override val requestSize: Int
        get() = 12
    override val responseSize: Int
        get() = TODO("Not yet implemented")
    override val requestBody: String
        get() = TODO("Not yet implemented")
    override val responseBody: String
        get() = TODO("Not yet implemented")

    override fun validate(requestBody: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun start() {
        TODO("Not yet implemented")
    }

    override fun end(isConnect: Boolean) {
        TODO("Not yet implemented")
    }

    override fun implemented() {
        super.implemented()
        println("after calling super of implemented")
    }

}