import function.OverloadTestClass

fun main() {
    val aa = "011"
    println(aa.toInt(2))
//    printls("first","second", "third","forth")
}

fun printls(vararg list: String) {

    val a = arrayOf(1)
    val b = arrayOf(1)
    val c = a+b

    println(c)

    a[1]=1


    for (item in list) {
        println(item)
    }

    D()()
}


class D : ()->Unit{
    override fun invoke() {


    }


}