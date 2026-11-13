/*
###############################################
# Program: BankAccountApp.kt                  #
# Author: Quoc Bao Nguyen                     #
# Date created: NOV 4 2026                    #
# Last modified date: NOV 4 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_11

import Week_11.BankAccount

fun main()
{
    val accountUser_0000000001 = BankAccount("Maria Johnson")

    accountUser_0000000001.deposit(500.00)
    accountUser_0000000001.deposit(250.00)
    accountUser_0000000001.displayBalance()

    /*
    println(accountUser_0000000001.balance)
    accountUser_0000000001.updateBalance(100.00)
     */
}
