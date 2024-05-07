fun main() {
    comment(
        """
        --------------------------------
              Function inside others
        --------------------------------
    """.trimIndent()
    )
    sayHi()
    comment(
        """
        --------------------------------
               One Line Function
        --------------------------------
    """.trimIndent()
    )
    oneLine()
    comment()
    childTest(18)
    childTest(17)
    comment()
    person(name = "Mohamed", age = 21)
    comment(
        """
        --------------------------------
                   Vararg
        --------------------------------
    """.trimIndent()
    )
    printBook("Kotlin", "Ahmed Sayed", "Ramy Kamal", "Mostafa Mahmoud")
    comment(
        """
        --------------------------------
                   Overload
        --------------------------------
    """.trimIndent()
    )
    printUser("Mohamed", 99)
}

// Function inside others
fun sayHi() {
    println("HI")
    fun sayBye() {
        println("bye")
        fun name() {
            println("Moahemd")
        }
        name()
    }
    sayBye()
}

//Single line Functions
fun comment(com: String = "--------------------------------") = println(com)

fun oneLine() = println("One Line")

fun childTest(age: Int) = if (age.toInt() >= 18) println("Adult") else println("Child")

//Parameters
fun person(
    name: String,
    age: Int,
    job: String = "Developer"
) {
    println(
        """
        name: $name
        age: $age
        job: $job
    """.trimIndent()
    )
}


//Vararg
fun printBook(
    title: String,
    vararg authers: String
) {
    println("title:$title")
    authers.forEach { println("authers:$it") }
}


//Overload
fun printUser(name: String) {
    println("My Name: $name")
}

fun printUser(name: String, wight: Int) {
    println("My Name: $name")
    println("My Wight: $wight")
}