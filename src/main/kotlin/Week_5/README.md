
Week 5 Lab 1
Instructions

Create a Kotlin file named StringTemplateLab.kt.

Write a program that creates the following variables:

val studentName = "Alex"
val courseName = "Programming Logic"
val assignmentsCompleted = 8
val totalAssignments = 10

Use String Templates to display the following information:

Student: Alex
Course: Programming Logic
Assignments Completed: 8 out of 10
Assignments Remaining: 2

Your program must:

    Use $studentName, $courseName, $assignmentsCompleted, and $totalAssignments to insert variable values into strings.
    Use an expression inside ${ } to calculate the number of assignments remaining.
    Use println() to display each line.
    Do not use string concatenation (+) to build the output.
    Run the program and verify that the output matches the expected output shown above.

Submission

Submit the completed StringTemplateLab.kt file.

Your solution should demonstrate both forms of Kotlin string templates covered in the text: direct variable substitution with $identifier and expression evaluation with ${expression}


Week 5 Lab Assignment 2
Instructions

Create a Kotlin file named NumberTypesLab.kt.

Write a program that uses the following values:

val exam1 = 85
val exam2 = 92
val exam3 = 78
val totalPoints = exam1 + exam2 + exam3
val numberOfExams = 3

Your program must:

    Calculate and display the total points earned.
    Calculate the average using integer division and store the result in a variable named integerAverage.
    Calculate the average again using a Double so that the decimal portion is preserved, and store the result in a variable named decimalAverage.
    Use the modulus operator % to calculate the remainder when totalPoints is divided by numberOfExams.
    Use println() and string templates to display all results.
    Run the program and verify the output.

Kotlin integer division removes the fractional remainder, while involving a Double produces a floating-point result.
Expected Output

Your output should be similar to:

Total Points: 255
Integer Average: 85
Decimal Average: 85.0
Remainder: 0

Submission

Submit the completed NumberTypesLab.kt file.

Your solution should demonstrate the use of:

    Int
    Double
    Addition (+)
    Division (/)
    Modulus (%)
    Kotlin string templates
