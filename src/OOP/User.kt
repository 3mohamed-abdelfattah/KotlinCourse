class User {
    var name: String = ""
    var job: String = ""
    var age: Int = 0
    var gender: String = ""

    fun printFullUser() {
        println(
            """
        Name : $name
        Job : $job
        Age : $age
    """.trimIndent()
        )
    }

    fun checkGender() = if (gender == "Male") println("Mr $name") else println("MS $name")
}