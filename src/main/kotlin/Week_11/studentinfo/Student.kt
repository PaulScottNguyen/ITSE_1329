/*
###############################################
# Class Student.kt                            #
# Author: Quoc Bao Nguyen                     #
# Date created: NOV 4 2026                    #
# Last modified date: NOV 4 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_11.studentinfo

public class Student
    (
    val name: String,
    val major: String,
    val year: Int,
    )
{
    public fun displayInfo()
    {
        println("""
            
            Name: ${name}
            Major: ${major}
            Year: ${year}
        """.trimIndent())
    }
}