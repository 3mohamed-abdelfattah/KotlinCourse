fun main() {
    val sequence = generateSequence(1) { it+1 }
        .take(1475700).toList()

    println(sequence)
    println("is done!!!!")

    if (sequence.contains(50)){
        println("50 is Found!!!")
    }
}