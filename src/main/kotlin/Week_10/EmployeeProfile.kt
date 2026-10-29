/*
###############################################
# Program: EmployeeProfile.kt                 #
# Author: Quoc Bao Nguyen                     #
# Date created: OCT 28 2026                   #
# Last modified date: OCT 28 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */
/*=============================================
CONTEXT: A company needs a simple program to
create and display employee profiles. Instead
of assigning each property after an object is
created, the employee information should be
provided directly to the constructor.
 ==============================================
 */

package Week_10

//GLOBAL CONSTANTS AND VARIABLES

//CLASSES
class Employee(val employeeId: Int,
               val name: String,
               val department: String,
               var jobTitle: String,
               var yearsOfService: Int)
{
    //function to return a string containing all employee information
    fun describe() {
        println("""
Employee ID: $employeeId
Name: $name
Department: $department
Job Title: $jobTitle
Years of Service: $yearsOfService""")
    }
}

//main function
fun main() {
    //Employee objects
    val employee1 =
        Employee(
            101,
            "Alicia Johnson",
            "Information Technology",
            "Programmer",
            3
        )
    val employee2 =
        Employee(
            102,
            "Marcus Green",
            "Networking",
            "Network Technician",
            5
        )

    /*
    Call the describe() function for both
    employee objects and display the results
     */
    employee1.describe()
    employee2.describe()

    //Modify Mutable Constructor Properties
    employee1.jobTitle = "Senior Programmer"
    employee1.yearsOfService = 4

    //Display Alicia's updated information
    employee1.describe()
}
//eof