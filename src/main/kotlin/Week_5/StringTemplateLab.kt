/*
###############################################
# Program: StringTemplateLab.kt               #
# Author: Quoc Bao Nguyen                     #
# Date created: SEP 21 2026                   #
# Last modified date: SEP 21 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */
package Week_5

//studentInformation function
fun studentInformation() {
    //constant values
    val studentName = "Alex" //String
    val courseName = "Programming Logic" //String
    val assignmentsCompleted = 8 //Int
    val totalAssignments = 10 //Int


    println("Student: $studentName") //should be "Student: Alex"
    println("Course: $courseName") //should be "Course: Programming Logic"
    println("Assignments Completed: $assignmentsCompleted out of $totalAssignments") //should be "Assignments Completed: 8 out of 10"
    println("Assignments Remaining: ${totalAssignments - assignmentsCompleted}") //should be "Assignments Remaining: 2"
}

//main function
fun main() {
    studentInformation() //calling studentInformation
}
//eof