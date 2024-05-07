package Basics

fun main() {

    val myByte: Byte = 8
    val myShort: Short = 16
    val myInt: Int = 12
    val myLong: Long = 64
    val myFloat: Float = 32.00F
    val myDouble: Double = 64.00

    println("Byte=$myByte ${myByte::class.java}")
    println("Byte To Float=${myByte.toFloat()} ${myByte.toFloat()::class.java}")


    val plusTwo = myInt.plus(20)
    println(plusTwo)


    val stringHello = "Hello_Mohamed"
    println(stringHello)
    println(stringHello.uppercase())
    println(stringHello.lowercase())


    val aChar: Char = 'M'
    println(aChar)
    //Unicode
    println('\uFF00')

}