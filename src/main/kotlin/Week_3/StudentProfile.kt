/*
###############################################
# Program: StudentProfile.kt                  #
# Author: Quoc Bao Nguyen                     #
# Date created: SEP 9 2026                    #
# Last modified date: SEP 9 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */
package Week3

fun main() {
    //Create the variables
    val studentName : String = "Quoc Bao Nguyen" //constant value
    val studentAge : Int = 19 //constant value
    val programName : String = "Computer Science" //constant value
    var gpa : Double = 3.14159265359 //variable
    val isFullTime : Boolean = true //constant value
    var gradeLetter : Char = '?' //variable

    //Display all six values using println()
    println(studentName)
    println(studentAge)
    println(programName)
    println(gpa)
    println(isFullTime)
    println(gradeLetter)

    //Change the value stored in gpa and gradeLetter
    gpa = 4.0
    gradeLetter = 'A'

    //Display the updated gpa and gradeLetter
    println(gpa)
    println(gradeLetter)
}
//eof