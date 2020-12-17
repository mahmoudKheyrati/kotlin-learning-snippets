package tinyTests



fun main() {
    // map delegation
    val map = mapOf("one" to 1 , "two" to 2 , "three" to 3)
    val one: String by map
    val two: String by map
    val three: String by map
    println(one)
    println(two)
    println(three)



    val list = listOf(1, 2, 3, 4, 5, null)
    // remove null elements from the collection
    println(list.filterNotNull())

    mapTest()


}

fun mapTest() {
    val map = mapOf(1 to "one")
    println(map[1])
}

