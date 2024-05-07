

fun main() {

    val names = mapOf(
        1 to "Mohamed",
        2 to "Tamer",
        3 to "Sama",
        4 to "Rana"
    )
    val result = names[1]
    println(result)

    println("------------------------------------")

    val result2 = names.containsKey(5)
    println(result2)
    val result3 = names.containsValue("Sama")
    println(result3)

    println("-------------------------------------")

    println(names.entries)
    println(names.keys)
    println(names.values)


    println("""
        -------------------------------------------------
                          Mutable Map
        -------------------------------------------------
    """.trimIndent())


    val mutableMap = mutableMapOf(
        1 to "4ohamed",
        2 to "3amer",
        3 to "2ama",
        4 to "1ana"
    )

    println(mutableMap)

    mutableMap.put(5,"test")
    println(mutableMap)

    val rem =mutableMap.remove(2,"amer")
    println(mutableMap)
    println(rem)

    println("-------------------------------------------")

    mutableMap.getOrPut(7, { "Bow" })
    println(mutableMap)

    println("-------------------------------------------")

    val names1 = mapOf(
        1 to "Mohamed",
        2 to "Tamer",
        3 to "Sama",
        4 to "Rana"
    )
    val filter = names1.filterValues { it.contains("M") }
        .map { it.value.substring(0,4) }
    println(filter)


    println("""
        -------------------------------------------------
                          Map Not Null
        -------------------------------------------------
    """.trimIndent())

    val nullMap = mapOf(
        1 to "Mohamed",
        2 to null,
        3 to "Sama",
        4 to "Rana",
    )

    val res = nullMap.mapValues {it.toString().contains("null")}
    println(res)

    fun delNull (entry: Map.Entry<String,String>): Map.Entry<String, String>?{
        if (entry.key.startsWith("n")) {
            return null
        }else{
            return entry
        }
    }

    //Not null return!!!!
    val res1 = nullMap.mapNotNull {it.value}
    println(res1)

}