fun main() {
    println("Enter Three Num:")

    val (numOne,numTwo,numThree)=IntArray(3){ readln().toInt() }

    println(numOne in numTwo..numThree || numOne in numThree..numTwo)

    //Another Way
//    if (numOne >= numTwo && numOne <= numThree || numOne <= numTwo && numOne >= numThree) {
//        println(true)
//    } else {
//        println(false)
//    }
}
