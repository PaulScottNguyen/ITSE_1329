Instructions

Practice creating a Kotlin class with var and val properties, creating multiple objects, modifying object state, and accessing properties using dot notation.
Scenario

A college needs a simple program to track student enrollment information. Each student should have a name, course name, number of completed assignments, and total number of assignments.
Requirements

Create a Kotlin file named:

StudentTracker.kt
Part 1 — Create the Student Class

Create a class named Student.

Inside the Student class, create the following properties:

    A var property named studentName initialized to "Unknown"

    A var property named courseName initialized to "Kotlin Programming"

    A var property named completedAssignments initialized to 0

    A val property named totalAssignments initialized to 10

Part 2 — Create a Member Function

Inside the Student class, create a function named:

completeAssignment()

The function must:

    Increase completedAssignments by 1.

    Prevent completedAssignments from becoming greater than totalAssignments.

    Return the updated number of completed assignments.

Part 3 — Create Student Objects

In main():

    Create two Student objects named student1 and student2.

    Assign the following values using dot notation:

student1

    Student Name: Maria

    Course Name: Kotlin Programming

    Completed Assignments: 4

student2

    Student Name: James

    Course Name: Kotlin Programming

    Completed Assignments: 7

Part 4 — Modify Object State

Call completeAssignment():

    Two times for student1

    One time for student2

Part 5 — Display the Results

Display the following information for each student:

    Student name

    Course name

    Completed assignments

    Total assignments

Your output should be similar to:

Student: Maria
Course: Kotlin Programming
Assignments Completed: 6
Total Assignments: 10

Student: James
Course: Kotlin Programming
Assignments Completed: 8
Total Assignments: 10


Instructions

Practice creating Kotlin classes with constructors, passing arguments when objects are created, using val and var constructor properties, and creating multiple objects with different values.
Scenario

A company needs a simple program to create and display employee profiles. Instead of assigning each property after an object is created, the employee information should be provided directly to the constructor.
Requirements

Create a Kotlin file named:

EmployeeProfile.kt
Part 1 — Create the Employee Class

Create a class named Employee.

The constructor must accept the following parameters:

    val employeeId: Int

    val name: String

    val department: String

    var jobTitle: String

    var yearsOfService: Int

The employeeId, name, and department properties should not be reassigned after the object is created.

The jobTitle and yearsOfService properties should be allowed to change.
Part 2 — Create a Member Function

Inside the Employee class, create a function named:

describe()

The function should return a String containing all employee information.

Example:

Employee ID: 101
Name: Alicia Johnson
Department: Information Technology
Job Title: Programmer
Years of Service: 3

Part 3 — Create Employee Objects

In main(), create at least two Employee objects using constructor arguments.

Use the following information:

Employee 1

    Employee ID: 101

    Name: Alicia Johnson

    Department: Information Technology

    Job Title: Programmer

    Years of Service: 3

Employee 2

    Employee ID: 102

    Name: Marcus Green

    Department: Networking

    Job Title: Network Technician

    Years of Service: 5

Part 4 — Display Employee Information

Call the describe() function for both employee objects and display the results.
Part 5 — Modify Mutable Constructor Properties

After displaying the original information:

    Change Alicia's jobTitle from Programmer to Senior Programmer.

    Increase Alicia's yearsOfService from 3 to 4.

    Display Alicia's updated information.

Do not change:

    employeeId

    name

    department

These should remain val properties.
Expected Output

Your output should be similar to:

Employee ID: 101
Name: Alicia Johnson
Department: Information Technology
Job Title: Programmer
Years of Service: 3

Employee ID: 102
Name: Marcus Green
Department: Networking
Job Title: Network Technician
Years of Service: 5

Updated Employee Information:
Employee ID: 101
Name: Alicia Johnson
Department: Information Technology
Job Title: Senior Programmer
Years of Service: 4