/*
###############################################
# Program: ProductInfo.kt                     #
# Author: Quoc Bao Nguyen                     #
# Date created: SEP 9 2026                    #
# Last modified date: SEP 9 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */
package Week3

fun main() {
    //Create the variables
    val productName = "Wireless Mouse" //String
    val productNumber = 105 //Int
    var price = 24.99 //Double
    var quantity = 10 //Int
    val inStock = true //Boolean
    val categoryCode = 'E' //Char

    //Display each variable using println()
    println(productName)
    println(productNumber)
    println(price)
    println(quantity)
    println(inStock)
    println(categoryCode)

    //Change the value stored in price and quantity
    price = 49.99
    quantity = 50

    //Display the updated price and quantity
    println(price)
    println(quantity)
}
//eof