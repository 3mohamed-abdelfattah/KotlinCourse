fun main() {
    val sequen = generateSequence(1) { it+1 }
        .take(1475700).toList()

    println(sequen)
    println("is done!!!!")

    if (sequen.contains(50)){
        println("50 is Found!!!")
    }
}