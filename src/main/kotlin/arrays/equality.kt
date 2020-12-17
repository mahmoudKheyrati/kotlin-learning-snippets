package arrays


fun main() {
    // you should use contentEqual for array of int, double, ...

    val a = arrayOf(1,2,3)
    val b = arrayOf(1,2,3)
    
    val aa = intArrayOf(1,2,3)
    val bb = intArrayOf(1,2,3)
    println("a==b = ${a==b}")
    println("a.contentEquals(b) = ${a.contentEquals(b)}")
    println()

    println("aa==bb = ${aa==bb}")
    println("aa.contentEquals(bb) = ${aa.contentEquals(bb)}")
}
    
