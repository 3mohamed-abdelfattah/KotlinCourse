data class DataClass(val name: String = "Unknown", val age: Int = 0)
data class Orders(val amount: Int = 0, val copy: String)

fun main() {
    val st1 = DataClass("Mohamed", 21)
    val st2 = DataClass("Aya", 15)
    val st3 = DataClass("Marwa", 22)
    val st4 = DataClass("Mohamed", 21)

    println(st1 == st4)
    println("=============================")
    println(st1 == st2)
    println("=============================")
    println(
        """
        $st1
        $st2
        $st3
        $st4
    """.trimIndent()
    )
    println(
        """
        ---------------------------
               Destructuring
        ---------------------------
    """.trimIndent()
    )
    val (name2, age2) = DataClass(age = 2)
    println(name2)
    println(age2)
    println(
        """
        ---------------------------
                  Copying
        ---------------------------
    """.trimIndent()
    )
    val obj = DataClass("Osama", 99)
    val myCopy = obj.copy(name = "Ali")
    println(myCopy)
    println("------------------")
    val orderCustomer = Orders(5934, myCopy.age.toString())
    println(orderCustomer)
}