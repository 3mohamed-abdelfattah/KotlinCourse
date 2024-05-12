fun main() {

    val myList = listOf(1, 2, 3, 4, 5)

    println(myList.first())
    println(myList.last())
    println(myList[3])

    if (myList.first() == 1) println(emptyList<Int>()) else println(myList[0])

    println("--------------------------")

    myList.forEach { println(it) }

    println(
        """
        ---------------------------------
        MutableList
        ---------------------------------
    """.trimIndent()
    )

    //MutableList
    val multiplList = mutableListOf(1, 2, 3, 4, 5)
    println(multiplList)
    multiplList.add(6)
    println(multiplList)
    multiplList.add(2, 5000)
    println(multiplList)
    multiplList.set(1, 1000)
    println(multiplList)
    multiplList.removeAt(1)
    println(multiplList)
    multiplList.remove(6)
    println(multiplList)
    multiplList[0] = 2
    println(multiplList)

    println("--------------------------")

    //Filter

    val nameList = mutableListOf("Mohamed", "Ahmed", "Omar", "All", "Manor")
    val filterList = nameList.filter { it != "Mohamed" }
    println(filterList)
    val filterList1 = nameList.filter { it == "Mohamed" }
    println(filterList1)
    val filterNot = nameList.filterNot { it == "Omar" }
    println(filterNot)
    val filterNot1 = nameList.filterNot { it.contains('a') }
    println(filterNot1)

    println("--------------------------")

    //Filter Function
    fun isChild(age: Int): Boolean {
        return age <= 18
    }

    val agelist = mutableListOf(
        11, 42, 1, 4, 6, 45, 4, 32, 2, 5, 52, 5, 45, 2, 52, 5, 2, 68, 7, 99, 18, 0, 8, 97, 56, 745, 64, 63
    )
    val agelistNew = buildList<Int> {
        addAll(
            listOf(
                11, 42, 1, 4, 6, 45, 4, 32, 2, 5, 52, 5, 45, 2, 52, 5, 2, 68, 7, 99, 18, 0, 8, 97, 56, 745, 64, 63
            )
        )
    }
    val children = agelist.filter(::isChild)
    println(children)
    println(children.find { it >= 19 })

    println(agelistNew)
    println("--------------------------")

    //Flatten List
    val nameList1 = mutableListOf("A", "B", "C", "D", "E")
    val nameList2 = mutableListOf("F", "G", "H", "I", "G")
    val nameList3 = mutableListOf("K", "L", "M", "N", "O")

    val allLists = listOf(nameList1, nameList2, nameList3)

    println(allLists)
    println(allLists.flatten())
    println(nameList1.plus(nameList2).plus(nameList3).minus("N"))



    println(
        """
        --------------------------------------------------------
                                  MAP
        --------------------------------------------------------
    """.trimIndent()
    )
    //Map
    val mapList = listOf("Ahmed Ayman", "Ramy Elsbeth", "Alaa Frowzy", "Dorian Yates")
    val mapping = mapList.map { it.trim('y').uppercase() }
    println(mapping)

    println("-------------------------------------------")
    val mapSplit = mapList.map {
        val word = it.split(' ')
        word[0].substring(0, 1) + word[1].substring(0, 1)
    }
    println(mapSplit)

}