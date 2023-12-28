package com.example.rockpaperscissors


fun main() {
    val computerChoice = getComputerChoice()
    val userChoice = getUserChoice()
    if (computerChoice != null) {
        println("Computer choice is: ${computerChoice.uppercase()} \n ${getAscii(computerChoice)}")
        println("Your choice is: ${userChoice.uppercase()} \n ${getAscii(userChoice)}")
        println(checkResult(computerChoice, userChoice))
    } else {
        printErrorAscii()
        throw Error("Something went wrong. Please try again.")
    }
}

fun checkResult(computerChoice: String, userChoice: String): Any {
    if (computerChoice == userChoice) {
        return "It's a tie. Give it another go \uD83D\uDE00"
    }
    return if (computerChoice == "Rock" && userChoice != "Paper") {
        "Computer won \u2639\uFE0F. Don't give up!"
    } else if (computerChoice == "Paper" && userChoice != "Scissors") {
        "Computer won \u2639\uFE0F. Don't give up!"
    } else if (computerChoice == "Scissors" && userChoice != "Rock") {
        "Computer won \u2639\uFE0F. Don't give up!"
    } else {
        "Congrats, you won \uD83D\uDE0A"
    }
}

fun getUserChoice(): String {
    println("Enter your choice. Choose between Rock, Paper or Scissors.")
    val userChoice: String = readln()
    if (!arrayOf("Rock", "Paper", "Scissors").contains(userChoice)) {
        printErrorAscii()
        throw Error("Your choice is invalid. Please enter a valid one.")
    }
    return userChoice
}

fun getComputerChoice(): String? {
    val pcChoiceIdx: Int = (1..3).random()
    return getMapping()[pcChoiceIdx]
}

fun getMapping(): Map<Int, String> {
    return mapOf(
        1 to "Rock",
        2 to "Paper",
        3 to "Scissors"
    )
}

fun printErrorAscii() {
    val redColor = "\u001B[31m" // ANSI escape code for red color
    println(
        """$redColor
              ___ _ __ _ __ ___  _ __ 
             / _ \ '__| '__/ _ \| '__|
            |  __/ |  | | | (_) | |   
             \___|_|  |_|  \___/|_| 
        $redColor"""
    )
}

fun getAscii(choice: String): String {
    val ascii = when (choice) {
        "Paper" -> """
                 _______
            ---'    ____)____
                       ______)
                      _______)
                     _______)
            ---.__________)
        """
        "Rock" -> """
                _______
            ---'   ____)
                  (_____)
                  (_____)
                  (____)
            ---.__(___)
        """
        else -> {
            """
                    _______
                ---'   ____)____
                          ______)
                       __________)
                      (____)
                ---.__(___)
            """
        }
    }
    return ascii
}