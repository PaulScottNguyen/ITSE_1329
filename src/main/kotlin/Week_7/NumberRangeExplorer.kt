/*
###############################################
# Program: NumberRangeExplorer.kt             #
# Author: Quoc Bao Nguyen                     #
# Date created: OCT 5  2026                   #
# Last modified date: OCT 5  2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_7

fun separate() {
    println()
    println()
}

fun forLoop( value : IntProgression) {
    for (i in value) {
        print("$i ")
    }
}

fun sumForLoop() {
    var sum : Int = 0
    for (i in 1 ..10) {
        sum = sum + i
    }
    println("Sum of 1 through 10: $sum")
}

fun main() {
    println("Numbers 1 through 10:")
    forLoop(1 .. 10)

    separate()

    println("Using until:")
    forLoop(1 until 10)

    separate()

    println("Countdown:")
    forLoop(10 downTo 1)

    separate()

    println("Even numbers:")
    forLoop(2 .. 20 step 2)

    separate()

    sumForLoop()
}
//eof