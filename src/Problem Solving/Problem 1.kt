/*Write a program that reads three integer numbers and prints true
if the first number lies between the second and third one (inclusive). Otherwise,
 it is to print false.
The sorting order of the two last arguments can be any.


======
Sample Input:
40
30
50
==
Sample Output :
true
======================================
Sample Input :

2
3
4
Sample Output :
false
*/

fun main() {
    println("Enter Three Num:")

    val (numOne, numTwo, numThree) = IntArray(3) { readln().toInt() }

    println(numOne in numTwo..numThree || numOne in numThree..numTwo)

    //Another Way
//    if (numOne >= numTwo && numOne <= numThree || numOne <= numTwo && numOne >= numThree) {
//        println(true)
//    } else {
//        println(false)
//    }
}
