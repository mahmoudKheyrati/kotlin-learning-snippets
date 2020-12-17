package tinyTests

import java.text.DecimalFormat
import kotlin.math.log10
import kotlin.math.pow

class ExtensionHost {
    val first = "first"
    private var privateKey = "private key"
    fun print(){
        println("$privateKey  - $first" )
    }
}

fun ExtensionHost.extend(){
    // because extension functions are static functions that don't access private members
//    this.privateKey = "something"
    println("first = $first")
    println("calling extend function ... ")
}


fun main() {
    // extention functions are just static functions
    // we tend to implement basic operations as member fuctions
    // and the other capabilities as an extention function

    // NOTE: we don't access to private member of the base class
    //       because it's just member function that are top of the class

    println(12000000000000L.humanReadable())


    val host = ExtensionHost()
    host.extend()
    host.print()

}

fun Long.humanReadable(): String {
    if (this <= 0) return "0"
    val units = arrayOf("B", "KB", "MB", "GB", "TB", "EB")
    val digitGroups = (log10(this.toDouble()) / log10(1024.0)).toInt()
    return DecimalFormat("#,##0.#").format(this/ 1024.0.pow(digitGroups.toDouble())) + " " +
            units[digitGroups]
}
fun Int.humanReadable(): String {
    return this.toLong().humanReadable()
}
