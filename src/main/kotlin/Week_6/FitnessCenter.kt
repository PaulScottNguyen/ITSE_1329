/*
###############################################
# Program: FitnessCenter.kt                   #
# Author: Quoc Bao Nguyen                     #
# Date created: SEP 28 2026                   #
# Last modified date: SEP 28 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_6

// isFitnessCenterOpen function (Part 1)
fun isFitnessCenterOpen(hour: Int) {
    val open: Int = 8
    val closed: Int = 21

    println("Operating hours: $open - $closed")

    // Using the && operator
    val status: Boolean = (hour >= open && hour < closed)
    println("Open: $status")
}

// isFitnessCenterClosed function (Part 2)
fun isFitnessCenterClosed(hour: Int) {
    val open: Int = 8
    val closed: Int = 21

    println("Operating hours: $open - $closed")

    // Using the || operator
    val status: Boolean = (hour < open || hour >= closed)
    println("Closed: $status")
}

// main function
fun main() {
    println("--- Part 1 Test ---")
    isFitnessCenterOpen(14)

    println("\n--- Part 2 Test ---")
    isFitnessCenterClosed(22)
}
//eof