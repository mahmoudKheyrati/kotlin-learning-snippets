package collections

fun fibonacci(): Sequence<Int> = sequence {
    yieldAll(listOf(0,1,1,2))
    var prev = 1
    var current = 2
    while (true) {
        current=(current+prev).also { prev= current }
        yield(current)
    }

}

fun main() {
    fibonacci().take(4).toList().toString() eq
            "[0, 1, 1, 2]"

    fibonacci().take(10).toList().toString() eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
}

private infix fun String.eq(s: String) {
    if (this == s) println("OK") else println("error")
}
