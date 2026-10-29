/*
###############################################
# Program: GradeStatus.kt                     #
# Author: Quoc Bao Nguyen                     #
# Date created: OCT 12 2026                   #
# Last modified date: OCT 12 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_8

fun main() {
    // Change score to 65 to test the alternative output
    val score = 82
    val result = if (score >= 70) "Pass" else "Fail"

    println("Student Score: $score")
    println("Course Result: $result")
}
//eof