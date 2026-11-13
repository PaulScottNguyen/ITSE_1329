/*
###############################################
# Class Course.kt                             #
# Author: Quoc Bao Nguyen                     #
# Date created: NOV 4 2026                    #
# Last modified date: NOV 4 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_11.courseinfo

class Course
    (
    val courseName: String,
    val credits: Int
    )
{
    public fun displayInfo()
    {
        println("""
            
            Course Name: ${courseName}
            Credits: ${credits}
        """.trimIndent())
    }
}