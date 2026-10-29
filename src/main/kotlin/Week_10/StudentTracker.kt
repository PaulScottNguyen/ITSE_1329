/*
###############################################
# Program: StudentTracker.kt                  #
# Author: Quoc Bao Nguyen                     #
# Date created: OCT 26 2026                   #
# Last modified date: OCT 26 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */
/*=============================================
CONTEXT: A college needs a simple program
to track student enrollment information.
Each student should have a name, course name,
number of completed assignments, and total
number of assignments.
 ==============================================
 */
package Week_10

//GLOBAL CONSTANTS AND VARIABLES

//CLASSES
class Student() {
    //CLASS PROPERTIES
    var studentName = "Unknown"
    var courseName = "Kotlin Programming"
    var completedAssignments = 0
    val totalAssignments = 10

    //CLASS FUNCTIONS
    fun completeAssignment(): Int {
        // Only increase if we havent reached the total yet
        if (completedAssignments < totalAssignments) {
            ++completedAssignments
        }
        return completedAssignments
    }
}

//main function
fun main() {
    //Initialize objects
    val student1 = Student()
    val student2 = Student()

    //student1
    student1.studentName = "Maria"
    student1.courseName = "Kotlin Programming"
    student1.completedAssignments = 4

    //student2
    student2.studentName = "James"
    student2.courseName = "Kotlin Programming"
    student2.completedAssignments = 7

    //Modify object state
    student1.completeAssignment()
    student1.completeAssignment()
    student2.completeAssignment()

    //Display the results
    println("Student: ${student1.studentName}")
    println("Course: ${student1.courseName}")
    println("Assignments Completed: ${student1.completedAssignments}")
    println("Total Assignments: ${student1.totalAssignments}")

    println("")

    println("Student: ${student2.studentName}")
    println("Course: ${student2.courseName}")
    println("Assignments Completed: ${student2.completedAssignments}")
    println("Total Assignments: ${student2.totalAssignments}")
}
//eof