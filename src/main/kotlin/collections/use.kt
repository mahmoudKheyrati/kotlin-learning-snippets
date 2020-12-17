package collections

import book.User
import java.io.Closeable
import java.io.File
import java.io.FileReader
import java.lang.Exception


class Reader : Closeable {
    override fun close() {
        println("closing the reader bro ... ")
    }

    fun perform() {
        throw Exception("ha ha ha ")
        @Suppress("UNREACHABLE_CODE")
        println("performing . . .")
    }

}

fun main() {

    println("before")
    val reader = Reader()
    reader.use { it.perform() }

    println("after")

}