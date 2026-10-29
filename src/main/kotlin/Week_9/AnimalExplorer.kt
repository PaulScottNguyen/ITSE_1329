/*
###############################################
# Program: AnimalExplorer.kt                  #
# Author: Quoc Bao Nguyen                     #
# Date created: OCT 21 2026                   #
# Last modified date: OCT 21 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_9

// Part 1 & 4 — Dog Class
class Dog {
    fun bark() = "Woof! Woof!"

    fun sleep() = "The dog is sleeping."

    fun exercise(): String {
        return this.bark() + " " + sleep()
    }
}

// Part 2 — Cat Class
class Cat {
    fun meow() = "Meow! Meow!"

    fun play() = "The cat is playing."
}

// Challenge — Robot Class
class Robot {
    fun greet() = "Hello! I am a robot."

    fun move() = "The robot is moving."

    fun performTask(): String {
        return greet() + " " + move()
    }
}

fun main() {
    println("=== Animal Explorer ===")

    // Part 1 & 3 — Dog Objects
    val dog1 = Dog()
    val dog2 = Dog()

    print("Dog 1: ")
    print(dog1.bark() + " ")
    println(dog1.sleep())

    // Part 2 — Cat Object
    val cat1 = Cat()
    print("Cat 1: ")
    print(cat1.meow() + " ")
    println(cat1.play())

    // Dog 2 output
    println("Dog 2: ${dog2.bark()}")

    // Part 4 — Dog Exercise
    println("Dog 1 Exercise: ${dog1.exercise()}")

    println("\n=== Robot Explorer ===")

    // Challenge Activity — Robot Object
    val robot1 = Robot()
    println(robot1.performTask())
}
//eof