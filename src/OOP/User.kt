open class User(name: String, job: String, age: Int, gender: String) {
    var name: String = ""
    var job: String = ""
    var age: Int = 0
    var gender: String = "Female"
        get() = "I,m : $field"
        set(vlaue)= if (vlaue=="") println("$gender=HE Male")  else println("Not!!!")

    val fullData: Any = println(
        """
        Name : $name
        Job : $job
        Age : $age
        Gender : $gender
    """.trimIndent()
    )
        //Override
        get() = "Full Data : $field"
}

fun main() {
    val over = User("Morphemed", "Doctor", 31,"Male")
    println(over.fullData)
    println("--------------------------")
    println(over.gender)

}
