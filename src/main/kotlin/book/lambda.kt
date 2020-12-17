package book



fun main() {
    val action= ::function
    action("mahmoud", 19)
}

fun function(name: String , age: Int){
    println("in function : $name , $age")
}