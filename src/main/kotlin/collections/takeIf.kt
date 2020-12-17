package collections


fun main() {
    val list = listOf<Any?>(1,2,3,null, 4,5,6,"string","mahmoud")
    val a = list.takeIf { it.all { it== null } }
    println(a)


}