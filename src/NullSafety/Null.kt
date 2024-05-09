fun main() {

    var a: String? = "A"
    println(a)
    a = null
    println(a)
    println(
        """
        --------------------------------
                  Safe Calls
        --------------------------------
    """.trimIndent()
    )
    var firstName: String? = "Mohamed"
    firstName = null
    println(firstName?.length)
    println(
        """
        --------------------------------
                  Check Null
        --------------------------------
    """.trimIndent()
    )
    var lenght = if (firstName != null) println(firstName.length) else println("Null")
    println(
        """
        --------------------------------
                  Elvis Operator
        --------------------------------
    """.trimIndent()
    )
    var elvis: String? = "Aliaa"
    elvis = null
    val len = elvis?.substring(0, 2)?.length ?: 0
    println(len)
    println(
        """
        --------------------------------
                  !! Operator
        --------------------------------
    """.trimIndent()
    )
    val nonNull: String? = "Mohamed Mohamed"
    val len1 = nonNull!!.length ?: 0
    println(len1)
    println(
        """
        --------------------------------
                Require Not Null
        --------------------------------
    """.trimIndent()
    )
    val nNull: String? = null
    val len3 = requireNotNull(nNull, { "Never Enter Null Value!!" }).length
    println(len3)
}
