/*
Write a program that reads two strings and outputs them in the reverse order, each in a new line.
=====================
Sample Input:
Kotlin
Java

======================
Sample Output:
Java
Kotlin

 */

fun main() {
    println(Array(2) { readln() }.reversed().joinToString("\n"))
}