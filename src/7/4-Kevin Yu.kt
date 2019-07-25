import kotlin.Boolean
import kotlin.random.Random

/*pakage com.marshall.example.models

import kotlin.random.Random

 */

fun main() {

    var wanToPlayAgain = true


    println("Welcome to RPS")

    while (wanToPlayAgain) {
        displayWelcomMessage()
        val userChoice: Int = readLine()?.toIntOrNull() ?: 0
        val aiChoice = Random.nextInt(1,3)
        playGame(userChoice, aiChoice)
        wanToPlayAgain = wanttoexit()
    }

}

fun wanttoexit(): Boolean {
    println("Do you want to stop?")

    val userChoice: String = readLine() ?: ""
    return when (userChoice) {
        "yes" ->  false
        else ->  true
    }

}

fun playGame(userChoice: Int, aiChoice: Int) {
    println("You chose ${userChoice} and the AI chose ${aiChoice}.")
    val result = when (userChoice) {
        aiChoice -> "You tied!"
        1 -> if (aiChoice == 2) "You loose!!" else "You Won!!"
        2 -> if (aiChoice == 3) "You loose!!" else "You Won!!"
        3 -> if (aiChoice == 1) "You loose!!" else "You Won!!"
        else -> "ERROR - INVALID ENTRY"
    }
    println(result)

}


private fun displayWelcomMessage(){
    println("Please enter one of the following numbers:")
    println("1 - Rock")
    println("2 - Paper")
    println("3 - Scissors")
    print("Enter your selection:")
}


