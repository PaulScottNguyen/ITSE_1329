Lab 1 – Student Profile

Create a Kotlin file named:

StudentProfile.kt

Inside the main() function, create the following variables:
Variable 	Type 	Requirement
studentName 	String 	Use val
studentAge 	Int 	Use val
programName 	String 	Use val
gpa 	Double 	Use var
isFullTime 	Boolean 	Use val
gradeLetter 	Char 	Use var

Use sample values of your choice.

Then:

    Display all six values using println().
    Change the value stored in gpa.
    Change the value stored in gradeLetter.
    Display the updated GPA and grade.
    Add comments identifying which variables can be reassigned and which cannot.

Submit:

StudentProfile.kt
Lab 2 – Online Store Product

Create a Kotlin file named:

ProductInfo.kt

Inside the main() function, create the following variables:

val productName = "Wireless Mouse"
val productNumber = 105
var price = 24.99
var quantity = 10
val inStock = true
val categoryCode = 'E'

Then:

    Display each variable using println().
    Add a comment beside each variable identifying the data type Kotlin inferred.
    Change the value stored in price.
    Change the value stored in quantity.
    Display the updated price and quantity.

Submit:

ProductInfo.kt
Lab 3 – Event Registration Tracker

Create a Kotlin file named:

EventRegistration.kt

Inside the main() function, create the following variables:
Variable 	Type 	Requirement
eventName 	String 	Use val
eventRoom 	String 	Use val
maximumCapacity 	Int 	Use val
registrationOpen 	Boolean 	Use val
eventCode 	Char 	Use val
registrationFee 	Double 	Use val
registeredStudents 	Int 	Use var

Assign appropriate values to each variable.

Then:

    Display all event information using println().
    Set registeredStudents to 15.
    Add three new registrations using:

registeredStudents = registeredStudents + 3

    Add five more registrations using:

registeredStudents += 5

    Create a variable named seatsRemaining:

val seatsRemaining = maximumCapacity - registeredStudents

    Display the final number of registered students and the number of remaining seats.

Submit:

EventRegistration.kt