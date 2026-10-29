Lab Assignment — Looping & Ranges: Number Range Explorer

Objective: Practice using Kotlin for loops with ranges, until, downTo, and step.

Instructions:

Create a Kotlin file named NumberRangeExplorer.kt.

Write a program that performs the following tasks:

    Use a for loop and the range 1..10 to display the numbers 1 through 10.
    Use a for loop with until to display the numbers 1 through 9.
    Use downTo to display the numbers 10 down to 1.
    Use step 2 to display the even numbers from 2 through 20.
    Create a variable named sum initialized to 0.
    Use a for loop to add all the numbers from 1 through 10 to sum.
    Display the final sum.

Your output should be clearly labeled. For example:

Numbers 1 through 10:
1 2 3 4 5 6 7 8 9 10

Using until:
1 2 3 4 5 6 7 8 9

Countdown:
10 9 8 7 6 5 4 3 2 1

Even numbers:
2 4 6 8 10 12 14 16 18 20

Sum of 1 through 10: 55

Submission: Submit NumberRangeExplorer.kt.

Week 7 Lab Assignment 2 — The in Keyword: Student Score Checker

The in keyword can test whether a value belongs to a range, while !in tests that a value does not belong to a range. The book also demonstrates using in with character ranges and Strings. Atomic_Kotlin

Objective: Practice using in and !in to determine whether values belong to ranges.

Instructions:

Create a Kotlin file named ScoreChecker.kt.

Write a program that:

    Creates an integer variable named score and assigns it the value 85.
    Display the value of score.
    Use if and the in keyword to determine whether the score is in the valid range 0 through 100.
    If the score is valid, display:

The score is valid.

    Use another if expression with in to determine whether the score is in the passing range 70 through 100.
    If it is in that range, display:

The student passed.

Otherwise, display:

The student did not pass.

    Use !in to determine whether the score is outside the range 0..100. If it is outside the range, display:

Invalid score.

Example Output:

Score: 85
The score is valid.
The student passed.

Test your program again by changing score to:

65

and then:

105

Observe how the output changes.

Submission: Submit ScoreChecker.kt.