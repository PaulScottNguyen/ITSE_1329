/*
###############################################
# Class BankAccount.kt                        #
# Author: Quoc Bao Nguyen                     #
# Date created: NOV 4 2026                    #
# Last modified date: NOV 4 2026              #
# Last modified by: Quoc Bao Nguyen           #
###############################################
 */

package Week_11

class BankAccount
        (
        public val accountHolder : String,
        )
{
    private var balance = 0.0

    public fun deposit
                (
                amount : Double
                )
    {
        updateBalance(amount)
        println("Deposited $amount")
    }

    public fun displayBalance()
    {
        println("""
            
            Account Holder: ${accountHolder}
            Balance: ${balance}
        """.trimIndent())
    }

    private fun updateBalance
                (
                updatedBalance: Double
                )
    {
        balance += updatedBalance
    }
}
