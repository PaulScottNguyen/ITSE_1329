/*
###############################################
# Program: ScoreChecker.kt                    #
# Author: Quoc Bao Nguyen                     #
# Date created: OCT 7 2026                    #
# Last modified date: OCT 7 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_7

fun main() {
    // 1. Create an integer variable named score and assign it the value 85
    // (Change this value to 65 or 105 to test the other scenarios)
    val score: Int = 85

    // 2. Display the value of score
    println("Score: $score")

    // 3 & 4. Use if and the in keyword to determine if score is in the valid range 0..100
    if (score in 0..100) {
        println("The score is valid.")
    }

    // 5 & 6. Use another if expression with in to check the passing range 70..100
    if (score in 70..100) {
        println("The student passed.")
    } else {
        println("The student did not pass.")
    }

    // 7. Use !in to determine whether the score is outside the range 0..100
    if (score !in 0..100) {
        println("Invalid score.")
    }
}
//eof