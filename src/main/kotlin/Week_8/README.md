Textbook: Atomic Kotlin – Expressions & Statements Estimated Completion Time: 30–40 minutes Points: 0 (Practice Only)
Lab Overview

In Kotlin, an expression produces a result, while a statement performs an action without producing a result.

In this practice lab, you will explore how expressions and statements work in Kotlin, including how if expressions return values, how for loops perform actions, and how the Unit type is used.
Learning Objectives

By completing this lab, you should be able to:

    Differentiate between expressions and statements.

    Use arithmetic expressions to calculate values.

    Use if expressions to assign values to variables.

    Understand how for loops perform actions.

    Explain the purpose of the Unit return type.

    Identify how Kotlin evaluates expressions within code blocks.

Part 1 – Working with Expressions

Scenario: A retail store needs a simple program to calculate the total cost of items purchased by a customer.

Instructions:

    Create a Kotlin file named ExpressionsPractice.kt.

    Inside the main() function, declare the following variables:

        val itemPrice = 15

        val quantity = 4

        val discount = 10

    Create a variable named subtotal that calculates the cost before the discount.

    Create another variable named finalTotal that subtracts the discount from the subtotal.

    Display the subtotal and final total using String templates.

Expected Output:

Subtotal: $60
Discount: $10
Final Total: $50

Practice Question: Which lines in your program contain expressions that produce values?
Part 2 – Using if as an Expression

Scenario: A college determines whether students pass a course based on their final grade.

Instructions:

    Create a Kotlin file named GradeStatus.kt.

    Declare a variable named score and assign it a value of 82.

    Create a variable named result.

    Use an if expression to assign "Pass" to result if the score is 70 or higher; otherwise, assign "Fail".

    Display the student's score and result using String templates.

    Change the score to 65 and run the program again.

Expected Output (score = 82):

Student Score: 82
Course Result: Pass

Expected Output (score = 65):

Student Score: 65
Course Result: Fail

Practice Question: Why can an if expression be assigned directly to a variable in Kotlin?
Part 3 – Working with Statements and Loops

Scenario: A training center wants to display the numbers of five students attending a programming workshop.

Instructions:

    Create a Kotlin file named StudentLoop.kt.

    Inside main(), use a for loop to iterate through the numbers 1 to 5.

    Display "Student Number: " followed by the current number.

    After the loop finishes, display "Attendance Completed".

Expected Output:

Student Number: 1
Student Number: 2
Student Number: 3
Student Number: 4
Student Number: 5
Attendance Completed

Practice Questions:

    Why is a for loop considered a statement rather than an expression in Kotlin?

    Can you assign a for loop directly to a variable? Explain your answer.

Part 4 – Understanding Unit

Scenario: A program uses a function to display a welcome message without returning a meaningful value.

Instructions:

    Create a Kotlin file named UnitPractice.kt.

    Create a function named displayWelcome() that displays "Welcome to Kotlin Programming!".

    Explicitly declare the function's return type as Unit.

    Inside main(), call displayWelcome() and assign its return value to a variable named result.

    Display result using println().

Expected Output:

Welcome to Kotlin Programming!
kotlin.Unit

Practice Questions:

    What does the Unit return type represent in Kotlin?

    Does println() return a meaningful value?

    What happens if you remove the explicit : Unit declaration from displayWelcome()?

Challenge Activity – Expressions Inside Code Blocks

Scenario: A store offers a $15 discount when a customer's purchase exceeds $100.

Instructions:

    Create a Kotlin file named DiscountChallenge.kt.

    Declare val purchaseAmount = 120.

    Create a variable named finalAmount.

    Use an if expression with curly braces to calculate the final amount.

    Inside the if block:

        Declare val discount = 15.

        Display "Discount Applied!".

        Make the last expression in the block calculate the purchase amount minus the discount.

    Inside the else block, use purchaseAmount as the resulting expression.

    Display the final amount.

    Change purchaseAmount to 80 and test the program again.

Expected Output (purchaseAmount = 120):

Discount Applied!
Final Amount: $105

Expected Output (purchaseAmount = 80):

Final Amount: $80

Challenge Questions:

    How does Kotlin determine the value returned by an if expression containing multiple lines?

    Why is the last expression in the selected code block important?

    Can the discount variable declared inside the if block be accessed outside that block? Why or why not?

Lab Completion

This is a non-graded practice activity designed to strengthen your understanding of Kotlin expressions and statements.

There is no formal submission or grade required. However, you should complete each activity, run your programs, and verify that your output matches the expected results.

Remember: An expression produces a result, while a statement performs an action. Understanding this distinction will help you write clearer, more effective Kotlin programs.