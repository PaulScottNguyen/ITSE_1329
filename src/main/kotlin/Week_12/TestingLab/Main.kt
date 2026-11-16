/*
###############################################
# Program: TestingLab                         #
# Author: Quoc Bao Nguyen                     #
# Date created: NOV 9 2026                    #
# Last modified date: NOV 9 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
*/

// PACKAGES
package Week_12.TestingLab

// IMPORTS
import atomictest.*

// FUNCTIONS
fun calculateDiscount(amount: Int): Int {
    return if (amount >= 200) {
        20
    } else if (amount >= 100) {
        10
    } else if (amount >= 50) {
        5
    } else {
        0
    }
}

// MAIN
fun main() {

    // Test using eq
    calculateDiscount(250) eq 20
    calculateDiscount(150) eq 10
    calculateDiscount(75) eq 5
    calculateDiscount(25) eq 0

    // Test using neq
    calculateDiscount(250) neq 10
    calculateDiscount(25) neq 20

    // Test using trace
    trace(calculateDiscount(250).toString())
    trace(calculateDiscount(150).toString())
    trace(calculateDiscount(75).toString())
    trace(calculateDiscount(25).toString())

    trace eq """
        20
        10
        5
        0
    """
}

// EOF