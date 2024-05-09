class `Companion Object` {

    companion object {
        val firstName: String = "Ahmed"
        val lastName: String = "Omar"

        fun print() = println("${`Companion Object`.firstName} ${`Companion Object`.lastName}")

    }
}

fun main() {
    `Companion Object`.print()
}