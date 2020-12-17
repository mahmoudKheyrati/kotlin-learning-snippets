package generic

interface Printable<T>{
    fun print(value: T )
}

class clazz<T> : Printable<T>{
    override fun print(value: T){
        println(value)
    }
}


fun main() {
    clazz<String>().print("hello")
}