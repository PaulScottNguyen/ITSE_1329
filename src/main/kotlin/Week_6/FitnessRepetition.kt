/*
###############################################
# Program: FitnessRepetition.kt               #
# Author: Quoc Bao Nguyen                     #
# Date created: SEP 28 2026                   #
# Last modified date: SEP 28 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_6

// Part 1 — Using a while Loop
fun countReps() {
    var rep = 1

    while (rep <= 5) {
        println("Repetition: $rep")
        rep += 1
    }
}

// Part 2 — Using a do-while Loop
fun countDown() {
    var count = 5

    do {
        println(count)
        count -= 1
    } while (count > 0)

    println("Exercise complete!")
}

// Challenge — Counting by 5s
fun countByFive() {
    var number = 5

    while (number <= 50) {
        println(number)
        number += 5
    }
}

// Main function to run all parts
fun main() {
    println("--- Part 1: Repetition Tracker ---")
    countReps()

    println("\n--- Part 2: Countdown Timer ---")
    countDown()

    println("\n--- Challenge: Count by Five ---")
    countByFive()
}
//eof