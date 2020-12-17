import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val thread = Thread {
        val reader = BufferedReader(InputStreamReader(System.`in`))
        reader.lines().forEach { println("it = ${it}") }
        println("after")

    }
    thread.start()

//    for (i in 0..100) {
//        println(i)
//        Thread.sleep(1000)
//    }
    Thread.sleep(100000)


}