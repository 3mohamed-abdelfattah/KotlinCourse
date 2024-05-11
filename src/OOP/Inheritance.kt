fun main() {
    //Sub Class
    val sub = SubClass()
    sub.name = "Ramy"
    sub.age = 23
    sub.job = "Doctor"
    println(
        """
        -------------------------
              Sub Class
        -------------------------
    """.trimIndent()
    )
    println(sub.name + "\n" + sub.age + "\n" + sub.job)
    println("-------------------------")
    println(sub.printInfo())
    println(sub.printJob())
    //Sub_Sub Class
    val subSub = SubSubClass()
    subSub.name = "Asmaa"
    subSub.age = 31
    subSub.job = "Nurse"
    subSub.salaryy = 9200
    println(
        """
        -------------------------
              Sub_Sub Class
        -------------------------
    """.trimIndent()
    )
    println(subSub.name + "\n" + subSub.age + "\n" + subSub.job + "\n" + subSub.salaryy)
}

//Super Class
open class Inheritance(var name: String = "Empty", var age: Int = 0) {
    fun printInfo() = println(
        """
        Name:$name
        Age:$age
        """.trimIndent()
    )
}

//Sub Class
open class SubClass(var job: String = "None") : Inheritance() {
    fun printJob() = println("Job:$job")
}

class SubSubClass(var salaryy: Int = 93713) : SubClass() {
    fun printSalaryy() = println("Salary:$salaryy")
}