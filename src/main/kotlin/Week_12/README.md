Practice Lab — Testing: Student Grade Checker
Practice Lab — Not Graded

Objective
Practice using Kotlin's testing features to verify that functions return expected results.

You will work with:

eq (equals)

neq (not equals)

trace

Writing and running multiple tests

Scenario
You are creating a small application that calculates student grades. Before using the application, you want to test its functions to ensure they produce the correct results.

Part 1 — Create the Kotlin File
Open IntelliJ IDEA.

Create a Kotlin Package named atomictest.

Create a Kotlin file named Main.kt.

Add the following import statement:

import atomictest.*
The atomictest package must be available in your project. It is the testing library provided with the Atomic Kotlin textbook.

Part 2 — Create a Function
Create a function named calculateGrade() that accepts an integer score and returns a letter grade.

Use these grading rules:

Score	Grade
90–100	A
80–89	B
70–79	C
60–69	D
Below 60	F
Use the following starter code:

fun calculateGrade(score: Int): String {
return if (score >= 90) "A"
else if (score >= 80) "B"
else if (score >= 70) "C"
else if (score >= 60) "D"
else "F"
}
Part 3 — Test Using eq
Inside main(), use eq to verify the expected results.

fun main() {
calculateGrade(95) eq "A"
calculateGrade(85) eq "B"
calculateGrade(75) eq "C"
}
Run the program and observe the results.

Add two additional tests to verify grades D and F.

Part 4 — Test Using neq
Use neq to verify that a function does not return an incorrect value.

Example:

calculateGrade(95) neq "B"
Add two more tests using neq.

Part 5 — Test Using trace
Use trace to capture several grade results and compare them with expected output.

Example:

trace(calculateGrade(95))
trace(calculateGrade(85))
trace(calculateGrade(75))

trace eq """
A
B
C
"""
Run the program and verify that the captured results match the expected output.

Part 6 — Observe a Failed Test
Temporarily add this test:

calculateGrade(95) eq "F"
Run the program and observe the error message.

Correct the test to make it pass.

Expected Results
All correct eq tests pass.

All correct neq tests pass.

trace verifies the expected grade sequence.

An intentionally incorrect test produces an error.

Practice Questions
What is the purpose of eq?

How does neq differ from eq?

Why is testing better than relying only on println()?

What happens when a test fails?

Submission: None. This is a practice activity.

Graded Lab — Testing: Shopping Discount Calculator
Objective
Demonstrate your understanding of Kotlin testing by creating a function and verifying its results using eq, neq, and trace.

Scenario
A retail store wants a simple application that calculates a customer's discount based on the purchase amount.

Your task is to develop the discount function and test it to ensure it produces the correct results.

Part 1 — Create the Project
Create a Kotlin package named TestingLab.

Create a file named Main.kt.

Import the atomictest library:

import atomictest.*
Part 2 — Create the Discount Function
Create a function named:

calculateDiscount(amount: Int): Int

The function must return the discount percentage using the following rules:

Purchase Amount	Discount
$200 or more	20
$100–$199	10
$50–$99	5
Below $50	0
Requirements:

Use an if / else if / else expression.

Return an Int representing the discount percentage.

The function must return the correct discount for each purchase amount.

Part 3 — Test Using eq
Write at least four eq tests.

Your tests must verify:

A purchase of $250 returns 20.

A purchase of $150 returns 10.

A purchase of $75 returns 5.

A purchase of $25 returns 0.

Example syntax:

calculateDiscount(250) eq 20
Part 4 — Test Using neq
Write at least two neq tests that confirm the function does not return an incorrect discount.

Example:

calculateDiscount(250) neq 10
Part 5 — Test Using trace
Use trace to capture the discounts returned for these purchase amounts:

$250

$150

$75

$25

Use trace eq to compare the captured output with the expected sequence.

Part 6 — Run the Application
Run your program and verify that all tests pass.

Your application should automatically verify the expected results using the testing features.

Submission Requirements
Submit the following in Brightspace D2L:

Main.kt containing your completed Kotlin program.

Screenshot showing the testing results in IntelliJ IDEA.

Grading Rubric
Criteria	Points
Correct implementation of calculateDiscount()	0.75
Four correct eq tests	0.50
Two correct neq tests	0.50
Correct use of trace and trace eq	0.50
Successful execution and screenshot	0.25
Total	2.50
Note: All tests must use the correct expected values. A test that verifies an incorrect result does not satisfy the requirements.

Practice Lab — Exceptions: Number Conversion and Validation
Practice Lab — Not Graded

Objective
Practice identifying exceptions and preventing application errors using Kotlin.

You will work with:

NumberFormatException

ArithmeticException

toInt()

toIntOrNull()

throw

IllegalArgumentException

Scenario
You are developing a simple application that converts numbers and performs calculations. Your application must recognize invalid input and provide meaningful error messages.

Part 1 — Create the Project
Open IntelliJ IDEA.

Create a Kotlin package named ExceptionsPractice.

Create a Kotlin file named Main.kt.

Part 2 — Observe a NumberFormatException
Enter the following code:

fun main() {
val number = "ABC".toInt()
println(number)
}
Run the program.

Observe the exception displayed in the console.

Identify:

The exception type.

The line where the exception occurred.

Why the exception occurred.

Part 3 — Prevent the Exception
Replace the code with:

fun main() {
val number = "ABC".toIntOrNull()
println(number)
}
Run the program.

Observe that the result is null rather than an uncaught exception.

Modify the program to use:

val number = "123".toIntOrNull()
Run the program again and observe the difference.

Part 4 — Observe an ArithmeticException
Replace your program with:

fun divideNumbers(a: Int, b: Int): Int {
return a / b
}

fun main() {
println(divideNumbers(100, 5))
println(divideNumbers(100, 0))
}
Run the program.

Observe what happens when division by zero occurs.

Part 5 — Throw a Meaningful Exception
Modify the divideNumbers() function to check whether b is zero.

fun divideNumbers(a: Int, b: Int): Int {
if (b == 0) {
throw IllegalArgumentException(
"The divisor cannot be zero"
)
}
return a / b
}
Run the program again.

Observe the exception type and the custom error message.

Part 6 — Practice Independently
Create a function named:

calculateAverage(total: Int, count: Int): Int

The function must:

Return total / count when count is greater than zero.

Throw an IllegalArgumentException when count is zero or negative.

Display the message: "Count must be greater than zero".

Test the function with:

calculateAverage(100, 5)
calculateAverage(100, 0)
Run the valid test first. Then run the invalid test separately so you can observe the exception.

Practice Questions
What causes a NumberFormatException?

What causes an ArithmeticException?

What is the difference between toInt() and toIntOrNull()?

What does the throw keyword do?

Why is IllegalArgumentException useful?

Submission: None. This is a practice activity.

