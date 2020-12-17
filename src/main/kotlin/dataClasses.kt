data class Address(val country:String,val city:String,val zipCode:Int,)
data class Person(val name:String,val age:Int,val address:Address)


/*
    we can't use vararg in the data classes
 */
//data class unlimitedArgs(val name: String, vararg val list: Int)

/*
 we can't mark data classes as open
 and because of that dataClasses can't inherit from another data classes
 */
//open data class GeneralData(val data:String,)


fun main() {
    val person = Person("mahmoud",19,Address("Iran","Shiraz",122))

    val (name, age, address) = person

    println(name)
    println(age)
    println(address)


}