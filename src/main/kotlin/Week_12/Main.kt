/*
###############################################
# Program: Student Grade Checker              #
# Author: Quoc Bao Nguyen                     #
# Date created: NOV 9 2026                    #
# Last modified date: NOV 9 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_12

import atomictest.*

fun calculateGrade(score: Int): String {
    return if (score >= 90) "A"
    else if (score >= 80) "B"
    else if (score >= 70) "C"
    else if (score >= 60) "D"
    else "F"
}

fun main()
{
    calculateGrade(95) eq "A"
    calculateGrade(85) eq "B"
    calculateGrade(75) eq "C"
    calculateGrade(65) eq "D"
    calculateGrade(55) eq "F"

    calculateGrade(95) neq "B"
    calculateGrade(100) neq "D"
    calculateGrade(65) neq "F"

    trace(calculateGrade(95))
    trace(calculateGrade(85))
    trace(calculateGrade(75))

    trace eq
    """
    A
    B
    C
    """

    //calculateGrade(95) eq "F"
}