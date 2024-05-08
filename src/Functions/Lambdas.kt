fun main() {

    val greeting: (String) -> String = { name: String -> "Name: $name" }
    val test = greeting("Mohamed")
    println(test)

    val greeting1 = { name: String -> "Name: $name" }
    val test1 = greeting1("Ahmed")
    println(test1)

    val greeting2 = { name: String, job: String -> "Name: $name  Job: $job" }
    val test2 = greeting2("Medo", "Master")
    println(test2)
    println(
        """
        ------------------------------------------
               Lambda(F) as (F)Parameter
        ------------------------------------------
    """.trimIndent()
    )
    saySome {
        println(1)
        println(2)
        println("Hi")
        println(false)
    }
    println(
        """
        ------------------------------------------
               Pass Arguments to Lambda(F)
        ------------------------------------------
    """.trimIndent()
    )
    sayIndex(20) {
        if (it < 10) {
            println("$it -> Under 10")
        } else {
            println("$it -> More 10")
        }
    }
}

fun saySome(block: () -> Unit) = block()

fun sayIndex(times: Int, block: (Int) -> Unit) {
    repeat(times) { index -> block(index) }
}