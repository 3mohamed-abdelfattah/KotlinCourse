package Basics

fun main() {

    // For Loop

    for (num in 0 until 10 step 2){
        println(num)
    }

    println("----------------------")

    for (num in 10 downTo 0 step 2){
        println(num)
    }

    println("----------------------")

    for (line in 0..5){
        for (stars in 0..line) {
            print("*")
        }
        println()
    }

    for (line in 5 downTo 0){
        for (stars in line downTo 0) {
            print("*")
        }
        println()
    }

    println("----------------------")

    var number =1
    for (line in 1..4){
        for (num in 1..line){
            print(number++)
        }
        println()
    }

    println("----------------------")

    val hash = 8
    for (i in 1..hash) {
        for (j in 1..hash) {
            print('#')
        }
        println()
    }


}
