/*
###############################################
# Program: ExceptionsLab                      #
# Author: Quoc Bao Nguyen                     #
# Date created: NOV 16 2026                   #
# Last modified date: NOV 16 2026             #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */
/*================================================
CONTEXT: A company wants a Kotlin application
that calculates an employee's average monthly
salary. The application must prevent calculations
involving invalid numbers of months and safely
handle text entered as a salary amount.
=================================================*/
//PACKAGES
package Week_13.ExceptionsLab

//IMPORTS

//CLASSES

//FUNCTIONS
fun calculateMonthlySalary(
    totalSalary: Int,
    months: Int
) : Int
{
    if (months > 0)
        return totalSalary / months
    else
        throw IllegalArgumentException(
            "Months must be greater than zero"
        )
}

fun convertSalary(
    salary: String
): Int?
{
    return salary.toIntOrNull()
}
//MAIN
fun main()
{
    println(calculateMonthlySalary(6000, 3))
    println(convertSalary("6000"))
    println(convertSalary("ABC"))
    println(calculateMonthlySalary(6000, 0))

    /*
    Expected output:
    2000
    6000
    null

    println(calculateMonthlySalary(6000, 0)) must be commented out
    to keep the code runs successfully.


    Expected behavior when months < 0 || months ==0:
    IllegalArgumentException: Months must be greater than zero
     */
}
//EOF

