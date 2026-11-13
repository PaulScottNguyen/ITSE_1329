Objective
Practice using Kotlin visibility modifiers to control access to properties and member functions within a class.

Scenario
You are creating a simple Bank Account program. Some account information should be available to other parts of the program, while sensitive information should remain accessible only inside the class.

Part 1 — Create the BankAccount Class
Create a Kotlin file named:

BankAccount.kt

Create a class named:

BankAccount

The class should contain the following properties:

A public val property named accountHolder initialized through the constructor.

A private var property named balance initialized to 0.0.

Example class structure:

class BankAccount(val accountHolder: String) {
private var balance = 0.0
}
Part 2 — Create Public Member Functions
Inside the BankAccount class, create a public function named:

deposit()

The function should:

Accept a Double parameter named amount.

Add amount to balance.

Display the amount deposited.

Create another public function named:

displayBalance()

The function should display:

Account holder name

Current account balance

Part 3 — Create a Private Member Function
Inside the BankAccount class, create a private function named:

updateBalance()

The function should:

Accept a Double parameter.

Add the value to the private balance property.

Modify deposit() so that it calls updateBalance() instead of changing balance directly.

Part 4 — Create and Use the Object
In main():

Create a BankAccount object for:

Maria Johnson

Deposit:

500.00

Deposit another:

250.00

Call displayBalance().

Your output should be similar to:

Deposited: $500.0
Deposited: $250.0
Account Holder: Maria Johnson
Balance: $750.0
Part 5 — Test Visibility
In main(), try adding the following lines:

println(account.balance)
account.updateBalance(100.0)
Observe what happens.

Then comment out both lines so your program can run successfully.

Reflection
Answer the following in comments at the bottom of your Kotlin file:

Why can main() access accountHolder?

Why can main() not access balance?

Why can deposit() call updateBalance()?

What is the benefit of making some class members private?

Key Concepts
This practice lab reinforces:

public members

private members

Controlling access to class data

Protecting mutable state

Calling private helper functions from inside a class


Objective
Practice creating Kotlin packages, placing classes in packages, importing classes from another package, and using package code in a separate Kotlin file.

Scenario
You are creating a small college application. You want to organize student-related classes into one package and use those classes from another part of the program.

Part 1 — Create a Package
Create a package named:

studentinfo

Inside the package, create a Kotlin file named:

Student.kt

The first non-comment statement in the file should be:

package studentinfo
Create a class named Student with the following constructor properties:

val name: String

val major: String

val year: Int

Add a member function named:

displayInfo()

The function should return a String containing the student's information.

Example:

Name: David Smith
Major: Computer Science
Year: 2
Part 2 — Create a Second Kotlin File
Create another Kotlin file named:

Main.kt

This file should be outside the studentinfo package.

Import the Student class using:

import studentinfo.Student
Part 3 — Create Student Objects
Inside main(), create two Student objects.

Student 1
Name: David Smith

Major: Computer Science

Year: 2

Student 2
Name: Grace Wilson

Major: Cybersecurity

Year: 1

Part 4 — Display the Student Information
Call displayInfo() for each Student object.

Your output should be similar to:

Name: David Smith
Major: Computer Science
Year: 2

Name: Grace Wilson
Major: Cybersecurity
Year: 1
Part 5 — Practice Fully Qualified Names
Comment out this import statement:

import studentinfo.Student
Modify one of your object declarations to use the fully qualified class name:

val student1 = studentinfo.Student(
"David Smith",
"Computer Science",
2
)
Run the program again.

Observe that the class can still be used without an import statement when the full package name is provided.

Challenge
Create another package named:

courseinfo

Inside it, create a class named Course with the following constructor properties:

val courseName: String

val credits: Int

Import Course into Main.kt.

Create one Course object and display its information.

Reflection
Answer the following in comments at the bottom of Main.kt:

What is the purpose of a package?

What does the import keyword do?

Where must the package statement appear in a Kotlin file?

What is a fully qualified class name?

How do packages help organize larger programs?

Key Concepts
This practice lab reinforces:

package

import

Organizing related classes

Reusing code from another package

Fully qualified class names

Separating code into logical groups