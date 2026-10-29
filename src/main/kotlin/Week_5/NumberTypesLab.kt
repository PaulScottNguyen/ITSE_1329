/*
###############################################
# Program: NumberTypesLab.kt                  #
# Author: Quoc Bao Nguyen                     #
# Date created: SEP 21 2026                   #
# Last modified date: SEP 21 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */
package Week_5

//main function
fun main() {
    //Constant values provided in the Week 5 Lab Assignment 2
    val exam1 = 85 //implicitly inferred as Int
    val exam2 = 92 //implicitly inferred as Int
    val exam3 = 78 //implicitly inferred as Int
    val totalPoints = exam1 + exam2 + exam3 //totalPoints already calculated the total points earned (Int)
    val numberOfExams = 3 //implicitly inferred as Int

    /*Calculate the average using integer division
      and store the result in a variable named integerAverage*/
    var integerAverage : Int = ((exam1 + exam2 + exam3)/numberOfExams)
    /*Since all the numbers inside the expression are Int types, the answer to the expression will also be Int type*/

    /*Calculate the average again using a Double so that the decimal portion is preserved,
      and store the result in a variable named decimalAverage*/
    val decimalAverage = totalPoints.toDouble() / numberOfExams
    /*Converts totalPoints from Int to Double and then divide by numberOfExams
    * to get a decimal answer (Double type)*/


    //Display output
    println("Total Points: $totalPoints") //display the total points earned
    println("Integer Average: $integerAverage ") //display integerAverage variable
    println("Decimal Average: $decimalAverage ") //display decimalAverage
    println("Remainder: ${totalPoints % numberOfExams}")
    /*Use the modulus operator % to calculate the remainder
      when totalPoints is divided by numberOfExams */
}
//eof