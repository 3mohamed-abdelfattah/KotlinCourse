class UserInit(val first: String, val last: String) {

    val fullName = "$first $last"
    var age: Int

    constructor(first: String) : this(first, "none") {
        println("Init Come First!!!!")
    }

    init {
        age = 25
        println("Hello $fullName")
        println("Age $age")
        println("------------------")
    }

    init {
        println("Init Test")
    }

}

fun main() {
    val user1 = UserInit("Mohamed", "Abdel-Fattah")
    val user2 = UserInit("Mohamed")
}