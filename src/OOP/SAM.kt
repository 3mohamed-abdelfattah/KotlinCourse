fun interface MyInter {
    fun printInfo(name: String, age: Int): String

}


fun main() {
    val obj = MyInter { name: String, age: Int -> name + "\n" + age }

//    val obj = object : MyInter {
//        override fun printInfo(name: String, age: Int): String {
//        }
//    }

    println(obj.printInfo("MOHAMED", 21))

}