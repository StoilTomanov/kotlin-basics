package com.example.simplebankaccountprogramm

fun main() {
    val customer1 = BankAccount(
        accountHolder = "Mike Cloud",
        balance = 3000.00,
    )

    customer1.deposit(542.05)
    customer1.deposit(9542.05)
    customer1.deposit(642.05)
    customer1.withdraw(859.23)
    customer1.withdraw(859335.23)
    customer1.withdraw(835.23)

    customer1.getBalance()
    customer1.displayTransactionHistory()
}