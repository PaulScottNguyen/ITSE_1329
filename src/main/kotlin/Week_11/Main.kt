/*
###############################################
# Program: Main.kt                            #
# Author: Quoc Bao Nguyen                     #
# Date created: NOV 4 2026                    #
# Last modified date: NOV 4 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */


package Week_11
//import Week_11.studentinfo.Student
import Week_11.courseinfo.Course

fun main()
{
    val studentID_0000000001 = Week_11.studentinfo.Student(
        "David Smith",
        "Computer Science",
        2
    )

    val studentID_0000000002 = Week_11.studentinfo.Student(
        "Grace Wilson",
        "Cybersecurity",
        1
    )

    val course_ITSE_1329_40 = Course(
        "Programming Logic and Design",
        3
    )

    studentID_0000000001.displayInfo()
    studentID_0000000002.displayInfo()
    course_ITSE_1329_40.displayInfo()
}