class UserCon(val first: String, val last: String, val boolean: Boolean) {

    constructor(first: String, last: String) : this(first, last, false)

    constructor(first: String) : this(first, "none")

    fun printTxt() {
        println(
            """
            $first
            $last
            $boolean
            ----------------------
        """.trimIndent()
        )
    }
}

fun main() {
    val user1 = UserCon("Hi", "Mohamed", true)
    user1.printTxt()

    val user2 = UserCon("Hello", "Tamer")
    user2.printTxt()

    val user3 = UserCon("Welcome")
    user3.printTxt()
}