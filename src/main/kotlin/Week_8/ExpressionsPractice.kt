/*
###############################################
# Program: ExpressionsPractice.kt             #
# Author: Quoc Bao Nguyen                     #
# Date created: OCT 12 2026                   #
# Last modified date: OCT 12 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_8

fun main() {
    val itemPrice = 15
    val quantity = 4
    val discount = 10

    val subtotal = itemPrice * quantity
    val finalTotal = subtotal - discount

    println("Subtotal: \$$subtotal")
    println("Discount: \$$discount")
    println("Final Total: \$$finalTotal")
}
//eof