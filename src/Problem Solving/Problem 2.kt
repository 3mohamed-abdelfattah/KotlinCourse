/*
Write a program that reads five words from the standard input and outputs the words in one line.
 In the output, the words should be separated by a single space.
 =====

Sample Input:
Never
gonna
give
you
up
==================

Sample Output:
Never gonna give you up


 */


fun main() {
    println("Enter Five Word:")

    println(Array(5) { readln() }.joinToString(separator = " "))
}