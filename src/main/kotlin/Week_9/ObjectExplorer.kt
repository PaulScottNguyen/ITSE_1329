/*
###############################################
# Program: ObjectExplorer.kt                  #
# Author: Quoc Bao Nguyen                     #
# Date created: OCT 21 2026                   #
# Last modified date: OCT 21 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_9

fun main() {
    println("=== Student Information Explorer ===")

    // Part 1 — Working with String Objects
    val studentName = "Alex Johnson"
    println("Original Name: $studentName")
    println("Uppercase: ${studentName.uppercase()}")
    println("Lowercase: ${studentName.lowercase()}")
    println("Reversed: ${studentName.reversed()}")
    println("Name Length: ${studentName.length}")

    println("\n=== Student ID Conversion ===")

    // Part 2 — Working with Number Objects
    val studentId = "2026"
    println("Original Student ID: $studentId")

    val convertedId = studentId.toInt() + 100
    println("Updated Student ID: $convertedId")

    val finalIdString = convertedId.toString()
    println("Converted Back to String: $finalIdString")

    println("\n=== Quiz Scores ===")

    // Part 3 — Working with IntRange Objects
    val quizScores = 70..75
    println("Quiz Score Range: $quizScores")

    val totalScores = quizScores.sum()
    val numberOfScores = quizScores.count()
    val averageScore = totalScores.toDouble() / numberOfScores

    println("Total Scores: $totalScores")
    println("Number of Scores: $numberOfScores")
    println("Average Score: $averageScore")

    println("\n=== Challenge Activity ===")

    // Challenge Activity — Explore Additional Member Functions
    val courseName = "Kotlin Programming"
    println("Contains Kotlin: ${courseName.contains("Kotlin")}")
    println("Starts with Java: ${courseName.startsWith("Java")}")
    println("Updated Course: ${courseName.replace("Kotlin", "Advanced Kotlin")}")
}
//eof