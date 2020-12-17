package intropability


// compile time constants ( primitives + string)
const val number = 2
const val userName = "mahmoud"

class StaticTest {

    companion object {
        @JvmField val name= "mahmoud"
        @JvmField val age = 19
        @JvmStatic var sta= "static"
        @JvmStatic val address= object {
            @JvmField val country = "Iran"
            @JvmField val city = "shiraz"
            @JvmField val postalCode: Long = 7451618897
        }
        const val constantCode = "const code"

    }
}
