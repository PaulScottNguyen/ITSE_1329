Graded Lab — Exceptions: Employee Salary Calculator
Objective
Demonstrate your understanding of exceptions by validating function arguments, preventing invalid calculations, and throwing meaningful exceptions in Kotlin.

Scenario
A company wants a Kotlin application that calculates an employee's average monthly salary.

The application must prevent calculations involving invalid numbers of months and safely handle text entered as a salary amount.

Part 1 — Create the Project
Create a Kotlin package named ExceptionsLab.

Create a Kotlin file named Main.kt.

Part 2 — Create the Salary Function
Create a function named:

calculateMonthlySalary(totalSalary: Int, months: Int): Int

Requirements:

Accept two integer parameters.

Calculate the average monthly salary by dividing the total salary by the number of months.

Return the calculated monthly salary.

Validate the months parameter before performing the calculation.

Part 3 — Throw an Exception
Modify the function so that when months is zero or negative, it throws:

throw IllegalArgumentException(
"Months must be greater than zero"
)
The function must not perform division when the number of months is invalid.

Part 4 — Validate String Input
Create another function named:

convertSalary(salary: String): Int?

Requirements:

Accept a String parameter.

Use toIntOrNull() to convert the salary to an integer.

Return the converted integer when valid.

Return null when the string cannot be converted.

Example:

convertSalary("6000")
convertSalary("ABC")
Part 5 — Test the Application
Inside main(), test the following:

Test 1 — Valid Salary Calculation

println(calculateMonthlySalary(6000, 3))
Expected output:

2000
Test 2 — Valid String Conversion

println(convertSalary("6000"))
Expected output:

6000
Test 3 — Invalid String Conversion

println(convertSalary("ABC"))
Expected output:

null
Test 4 — Invalid Number of Months

println(calculateMonthlySalary(6000, 0))
Expected behavior:

The program throws an IllegalArgumentException with the message:

Months must be greater than zero
Run this test separately, after confirming the first three tests, because the uncaught exception will stop the program.

Part 6 — Run and Verify
Run the application in IntelliJ IDEA.

Verify:

The valid salary calculation returns the correct result.

toIntOrNull() handles invalid text without throwing an exception.

Invalid months cause an IllegalArgumentException.

The exception displays the required custom message.

Submission Requirements
Submit the following in Brightspace D2L:

Main.kt containing both completed functions and the test code.

Screenshot showing successful calculations and conversions.

Screenshot showing the IllegalArgumentException and its message.

Grading Rubric
Criteria	Points
Correct implementation of calculateMonthlySalary()	0.75
Correct exception validation using throw and IllegalArgumentException	0.75
Correct implementation of convertSalary() using toIntOrNull()	0.50
All four required tests included	0.25
Required screenshots showing results	0.25
Total	2.50
Note: An invalid number of months must produce the specified exception message rather than an ordinary division-by-zero error.