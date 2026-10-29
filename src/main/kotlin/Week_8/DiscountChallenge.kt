/*
###############################################
# Program: DiscountChallenge.kt               #
# Author: Quoc Bao Nguyen                     #
# Date created: OCT 12 2026                   #
# Last modified date: OCT 12 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_8

fun main() {
    // Change purchaseAmount to 80 to test the alternative output
    val purchaseAmount = 120

    val finalAmount = if (purchaseAmount > 100) {
        val discount = 15
        println("Discount Applied!")
        purchaseAmount - discount // Last expression determines the returned value
    } else {
        purchaseAmount
    }

    println("Final Amount: \$$finalAmount")
}