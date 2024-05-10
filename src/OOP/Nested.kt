fun main() {
    val getClass = Nested.NestedTwo.NestedThree()
    getClass.hello()
}

class Nested {
    class NestedTwo {
        class NestedThree {
            var hey: String = "Hello World"
            fun hello() = println(hey)
        }
    }
}