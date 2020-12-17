package book

import kotlin.random.Random

interface User{
    val username: String
    val age : Int

}

interface Session{
    val user: User
}

class FacebookUser: User{
    override val username: String = "mahmoud"
    override val age: Int = 19
}
class GoogleUser: User{
    override val username: String
        get() = "google - ${Random.nextInt()}"
    override val age: Int
        get() = Random.nextInt()

}

class UserSession: Session{
    override val user: User
        get() {
            return when {
                Random.nextBoolean() -> {
                    GoogleUser()
                }
                else -> {
                    FacebookUser()
                }
            }
        }

}

fun main() {
    val session = UserSession()

    when (session.user) {
        is FacebookUser -> {
            println("facebook user: ${session.user.username}")
        }
        else -> {
            println("google user: ${session.user.username}")
        }
    }
}