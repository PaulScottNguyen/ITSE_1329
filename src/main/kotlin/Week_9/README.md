Topic: Objects Everywhere | File: ObjectExplorer.kt
Objective

Practice working with existing Kotlin objects, calling member functions using dot notation (.), and converting between data types.

Concepts Covered:

    Objects and instances

    Member functions and dot notation

    Working with String objects

    Working with IntRange objects

    Converting values using toInt(), toString(), and toDouble()

Scenario: Student Information Explorer

You are developing a simple student information program. The program will use Kotlin's built-in objects and member functions to process a student's name, student ID, and quiz scores.
Part 1 — Working with String Objects

Create a Kotlin file named ObjectExplorer.kt.

    Create a variable named studentName with the value "Alex Johnson".

    Display the student's original name.

    Use the uppercase() member function to display the name in uppercase.

    Use the lowercase() member function to display the name in lowercase.

    Use the reversed() member function to display the name backward.

    Use the length property to display the number of characters in the name.

Example of calling a member function:

val message = "Hello Kotlin"
println(message.uppercase())

Part 2 — Working with Number Objects

    Create a String variable named studentId containing "2026".

    Convert studentId to an integer using toInt().

    Add 100 to the converted integer.

    Display the new student ID.

    Convert the new student ID back to a String using toString().

    Display the converted String.

Part 3 — Working with IntRange Objects

    Create an IntRange object named quizScores containing values from 70 to 75.

    Display the range.

    Use sum() to calculate the total of the numbers in the range.

    Use count() to determine how many numbers are in the range.

    Calculate the average using toDouble() to ensure decimal division.

    Display the total, count, and average.

Expected Output

Console output

=== Student Information Explorer === Original Name: Alex Johnson Uppercase: ALEX JOHNSON Lowercase: alex johnson Reversed: nosnhoJ xelA Name Length: 12 === Student ID Conversion === Original Student ID: 2026 Updated Student ID: 2126 Converted Back to String: 2126 === Quiz Scores === Quiz Score Range: 70..75 Total Scores: 435 Number of Scores: 6 Average Score: 72.5
Challenge Activity — Explore Additional Member Functions

Modify your program to:

    Create a String variable named courseName containing "Kotlin Programming".

    Use contains("Kotlin") to determine whether the course name contains the word "Kotlin".

    Use startsWith("Java") to determine whether the course name begins with "Java".

    Use replace("Kotlin", "Advanced Kotlin") to create a modified course name.

    Display all three results.

Challenge Expected Output:

Contains Kotlin: true
Starts with Java: false
Updated Course: Advanced Kotlin Programming

Reflection Questions

    What is an object in Kotlin?

    What is the purpose of the dot (.) operator?

    What is the difference between toInt() and toString()?

    Why did you use toDouble() when calculating the average?

    What is the difference between a member function such as reversed() and a property such as length?

Topic: Creating Classes | File: AnimalExplorer.kt
Objective

Practice defining your own Kotlin classes, creating objects, and calling member functions using dot notation.

Concepts Covered:

    Defining classes using the class keyword

    Creating objects (instances)

    Defining member functions

    Calling member functions

    Understanding the difference between a class and an object

    Using this inside a class

Scenario: Animal Explorer

You are developing a simple animal information program for a small zoo. Each animal will belong to a class and perform actions using member functions.
Part 1 — Creating a Simple Class

Create a Kotlin file named AnimalExplorer.kt.

    Create a class named Dog.

    Inside the class, create a member function named bark().

    The bark() function should return the String "Woof! Woof!".

    Create another member function named sleep().

    The sleep() function should return the String "The dog is sleeping.".

    Inside main(), create an object named dog1 from the Dog class.

    Call the bark() and sleep() functions using the dog1 object.

    Display the results.

Example class structure:

class Animal {
fun speak() = "Animal sound"
}

fun main() {
val animal = Animal()
println(animal.speak())
}

Part 2 — Creating Another Class

    Create a second class named Cat.

    Inside the class, create a member function named meow() that returns "Meow! Meow!".

    Create another member function named play() that returns "The cat is playing.".

    Inside main(), create an object named cat1.

    Call both member functions using the cat1 object.

    Display the results.

Part 3 — Creating Multiple Objects

    Inside main(), create a second object named dog2 from the Dog class.

    Call the bark() function using dog2.

    Display the result.

This activity demonstrates that multiple objects can be created from the same class.
Part 4 — Calling Member Functions from Another Member Function

Modify the Dog class:

    Create a new member function named exercise().

    Inside exercise(), call bark() using this.bark().

    Call sleep() without using this.

    Combine the returned messages into one String, separating them with a space.

    Return the combined String.

    Inside main(), call dog1.exercise() and display the result.

For example:

class Bird {
fun chirp() = "Chirp!"

    fun fly() = this.chirp() + " Flying!"
}

Expected Output

Console output

=== Animal Explorer === Dog 1: Woof! Woof! The dog is sleeping. Cat 1: Meow! Meow! The cat is playing. Dog 2: Woof! Woof! Dog 1 Exercise: Woof! Woof! The dog is sleeping.
Challenge Activity — Create Your Own Class

Create a third class named Robot.

Requirements:

    Create a member function named greet() that returns "Hello! I am a robot.".

    Create another member function named move() that returns "The robot is moving.".

    Create a member function named performTask().

    Inside performTask(), call both greet() and move() and combine their results into one String.

    Inside main(), create an object named robot1.

    Call robot1.performTask() and display the result.

Challenge Expected Output:

=== Robot Explorer ===
Hello! I am a robot. The robot is moving.

Reflection Questions

    What is the purpose of the class keyword in Kotlin?

    What is the difference between a class and an object?

    What is a member function?

    Why do we use parentheses when creating an object, such as Dog()?

    What is the purpose of the this keyword?

    Can multiple objects be created from the same class? Explain
