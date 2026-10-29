/*
###############################################
# Program: EventRegistration.kt               #
# Author: Quoc Bao Nguyen                     #
# Date created: SEP 9 2026                    #
# Last modified date: SEP 9 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */
package Week_3

import kotlin.math.max

fun main() {
    //Create the variables
    val eventName : String = "Birthday party:)"
    val eventRoom : String = "McDonalds"
    val maximumCapacity : Int = 30
    val registrationOpen : Boolean = true
    val eventCode : Char = '@'
    val registrationFee : Double = 0.0
    var registeredStudents: Int = 13

    //Display all event information using println()
    println(eventName)
    println(eventRoom)
    println(maximumCapacity)
    println(registrationOpen)
    println(eventCode)
    println(registrationFee)
    println(registeredStudents)

    //Set registeredStudents to 15
    registeredStudents = 15

    //Add three new registrations
    registeredStudents = registeredStudents + 3

    //Add five more registrations
    registeredStudents += 5

    //Create a variable named seatsRemaining
    val seatsRemaining = maximumCapacity - registeredStudents

    //Display the final number of registered students and the number of remaining seats
    println(registeredStudents)
    println(seatsRemaining)
}
//eof