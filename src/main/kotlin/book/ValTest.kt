package book


enum class Color {
    RED,
    BLUE;
    fun testFunciton(){

    }
}

fun main() {

    val value = when (val clr = Color.RED) {
        Color.RED -> "color = red "
        Color.BLUE -> "color = blue "
        else -> "color = ${clr.name} "
    }
    println(value)
}

fun isValid(s: String): Boolean {
    fun isCharValid(ch: Char)= ch.isLetterOrDigit() || ch=='_'
    if (s.isEmpty() || s[0].isDigit()) return false
    for (letter in s) {
        if (!isCharValid(letter)) return false
    }
    return true
}