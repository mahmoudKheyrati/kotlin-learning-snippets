package book

interface oneMethodInterface {
    fun print() {}
}

fun sample(value: oneMethodInterface) {
    value.print()
}

fun main() {
    sample(object : oneMethodInterface {
        override fun print() {
            println("there we go")
        }
    })


}