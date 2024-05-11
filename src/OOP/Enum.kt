enum class Enum(val rgb: Int) {
    RED(0xFF0000),
    BLACK(0x000000),
    WHITE(0xffffff),
    GREEN(0x008000)
}

enum class Salary(val money: Int, val hour: Int) {
    LOW(5000, 11) {
        override fun printSomething(): String {
            return "Abstract LOW"

        }
    },
    NORMAL(10000, 8) {
        override fun printSomething(): String {
            return "Abstract NORMAL"
        }
    },
    HIGH(20000, 7) {
        override fun printSomething(): String {
            return "Abstract HIGH("
        }
    },
    MASTER(60000, 6) {
        override fun printSomething(): String {
            return "Abstract MASTER"
        }
    };

    //Abstract Function
    abstract fun printSomething(): String
}

fun main() {
    println(Enum.RED.rgb)
    println(Enum.GREEN)
    println("----------------------------------")
    println(Salary.LOW.printSomething())
    println(Salary.HIGH.money)
    println(Salary.MASTER.hour)
}