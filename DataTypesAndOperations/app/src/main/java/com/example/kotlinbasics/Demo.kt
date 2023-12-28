package com.example.kotlinbasics


fun main() {
    testIntegers()
    testBooleans()
    writeChars()
    writeStrings()
    testIfStatements()
    listOperationsAndForLoop(true)
}

fun listOperationsAndForLoop(shouldPrint: Boolean = false) {
    // immutable list
    val someList = listOf("Guitar, Piano")

    // mutable list
    val studioEquipment = mutableListOf("Instruments", "Laptop Huawei Matebook", "Mixer - Pioneer")
    if (shouldPrint) println(studioEquipment)
    studioEquipment.add(2, "DAW - Cubase")
    if (shouldPrint) println(studioEquipment)
    studioEquipment.remove("Mixer - Pioneer")
    // this add to the end of the list
    studioEquipment.add("Mixer - Tractor")
    if (shouldPrint) println(studioEquipment)
    val indexOfDaw = studioEquipment.indexOf("DAW - Cubase")
    studioEquipment[indexOfDaw] = "DAW - FL Studio 20"
    if (shouldPrint) println(studioEquipment)

    if (shouldPrint) {
        if (studioEquipment.contains("Instruments")) {
            println("Yes, studio has instruments")
        } else {
            println("No, there are no instruments in the studio")
        }
    }

    for (item in studioEquipment) {
        if (shouldPrint) println(item)
    }

//    // with indices
//    for (index in studioEquipment.indices) {
//        studioEquipment[index] = studioEquipment[index] + " \u2705"
//        if (shouldPrint) println(studioEquipment[index])
//    }
//
//    // with until
//    for (index in 0 until studioEquipment.size) {
//        studioEquipment[index] = studioEquipment[index] + " \u2705"
//        if (shouldPrint) println(studioEquipment[index])
//    }

    // with range
    for (index in 0..<studioEquipment.size) {
        studioEquipment[index] = studioEquipment[index] + " \u2705"
        if (shouldPrint) println(studioEquipment[index])
    }
}

fun testIfStatements (shouldPrint: Boolean = false, shouldAsk: Boolean = false) {
    if (!shouldAsk) {
        return
    }

    fun charge() {
        println("What is your gender? f/m")
        val gender: String = readln()
        if (gender == "f") {
            if (shouldPrint) {
                println("It's a ladies night. You can go in free. Have fun.")
            }
        } else if (gender == "m") {
            if (shouldPrint) {
                println("It's a ladies night. You are charged 20 EUR.")
            }
        } else {
            if (shouldPrint) {
                println("Invalid input.")
            }
        }
    }

    println("Please enter your age")
    val age: Int = readln().toInt()

    if (age in 18..49) {
        if (shouldPrint) {
            println("User is above 18 years and le than 50. He is allowed to go in the club.")
            charge()
        }
    } else {
        if (shouldPrint) {
            println("User is not allowed to go in the club.")
        }
    }
}

fun writeStrings(shouldPrint: Boolean = false) {
    // strings are defined in a double quote
    val firstName = "Mike"
    val upperName = firstName.uppercase()
    val interpolation = "$firstName Tyson"
    val multiLineString = """
        This is multiline string.
        Nice, huh?
    """
    if (shouldPrint) {
        println(firstName)
        println(upperName)
        println(interpolation)
        println(multiLineString)
    }
}

fun writeChars(shouldPrint: Boolean = false) {
    // chars are defined in a single quote
    val copyrightChar = '\u00A9'
    val yenChar = '\u00A5'
    if (shouldPrint) {
        println(copyrightChar)
        println(yenChar)
    }
}

fun testIntegers(shouldPrint: Boolean = false) {
    val integer = 34
    val longNum = 349484343487374
    val floatNum = 5.49f
    val doubleNum = 82.345
    val arrToPrint = arrayOf(integer, longNum, floatNum, doubleNum)

    for (el in arrToPrint) {
        if (shouldPrint) {
            println(el)
        }
    }
}

fun testBooleans(shouldPrint: Boolean = false) {
    val trueVal = true
    val falseVal = false

    if (shouldPrint) {
        println(falseVal || trueVal) // true
        println(falseVal && trueVal) // false
        println(!falseVal) // true
    }
}
