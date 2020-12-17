package classes


open class Entity private constructor(name: String){
    protected constructor(name: String, id: Int) : this(name)
    internal constructor(name: String , id:Int , secretKey: String): this(name)
}
class EntityChild constructor(): Entity("child",0) {
    constructor(a: String) : this()
}

fun main() {
    val entity = Entity("entityName",12,"secret-key")
}