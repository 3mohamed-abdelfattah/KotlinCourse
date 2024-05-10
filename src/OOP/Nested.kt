fun main() {
    val classOne = Nested()
    val classTwo = classOne.NestedTwo()
    val getClass = classTwo.NestedThree()
    getClass.hello()
    getClass.innerPrint()
}

class Nested {
    val testInner: Int = 2002

    inner class NestedTwo {
        inner class NestedThree {
            var hey: String = "Hello World"
            fun hello() = println(hey)
            fun innerPrint() = println(testInner)

        }
    }
}