Kotlin Practice Lab: Boolean Expressions

Scenario: A recreation center allows students to use the fitness room only during operating hours. The fitness room opens at 8:00 AM and closes at 9:00 PM (21:00).

Students will create two functions: one to determine whether the fitness room is open and another to determine whether it is closed.
Part 1 — Using the AND (&&) Operator

Create a Kotlin file named FitnessCenter.kt.

Write a function named isFitnessCenterOpen() that:

    Accepts an integer parameter named hour.
    Creates a variable named open with a value of 8.
    Creates a variable named closed with a value of 21.
    Displays the operating hours.
    Creates a Boolean variable named status.
    Use the && operator to determine whether hour is:
        Greater than or equal to open, AND
        Less than closed.
    Display whether the fitness center is open.
    Call the function from main() using an hour of 14.

Your output should look similar to:

Operating hours: 8 - 21
Open: true

Part 2 — Using the OR (||) Operator

Add another function named isFitnessCenterClosed().

The function should:

    Accept an integer parameter named hour.
    Create open and closed variables using the same operating hours.
    Create a Boolean variable named status.
    Use the || operator to determine whether hour is:
        Less than open, OR
        Greater than or equal to closed.
    Display whether the fitness center is closed.
    Call the function using an hour of 22.

Your output should look similar to:

Operating hours: 8 - 21
Closed: true

Challenge

Change the hour passed to each function and predict the Boolean result before running the program. Test these values:

6, 8, 12, 20, 21, and 23

For each value, determine whether the fitness center is open (true) or closed (true).

Kotlin Practice Lab: Repetition with while

Scenario: A fitness center uses a digital display to help members track their exercise repetitions. You will create programs that use repetition to display exercise counts.
Part 1 — Using a while Loop

Create a Kotlin file named FitnessRepetition.kt.

Write a function named countReps() that:

    Creates a variable named rep with an initial value of 1.

    Use a while loop that continues as long as rep is less than or equal to 5.

    Inside the loop:

        Display the current repetition number.

        Increase rep by 1 using the += operator.

    Call the countReps() function from main().

Your output should look similar to:

Repetition: 1
Repetition: 2
Repetition: 3
Repetition: 4
Repetition: 5

Part 2 — Using a do-while Loop

Add another function named countDown().

The function should:

    Create a variable named count with an initial value of 5.

    Use a do-while loop to display the value of count.

    After displaying the value, decrease count by 1 using the -= operator.

    Continue the loop while count is greater than 0.

    After the loop ends, display:

Exercise complete!

    Call the countDown() function from main().

Your output should look similar to:

5
4
3
2
1
Exercise complete!

Challenge

Create a function named countByFive().

The function should:

    Create a variable named number with an initial value of 5.

    Use a while loop to display numbers from 5 through 50, counting by 5.

    Use the += operator to increase number during each repetition.

    Call the function from main().

Before running your program, predict:

    How many times will the loop execute?

    What will be the first number displayed?

    What will be the last number displayed?

    What value will number contain when the loop stops?

Your output should look similar to:

5
10
15
20
25
30
35
40
45
50

