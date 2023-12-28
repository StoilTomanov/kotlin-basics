package com.example.simplebankaccountprogramm

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class BankAccount(
    val accountHolder: String,
    var balance: Double,
    private var transactions: MutableList<String> = mutableListOf(),
) {
    fun deposit(amount: Double) {
        println("Depositing money: $amount ...")
        loading()
        balance += amount
        addTransactionHistory("$accountHolder has deposited $amount")
    }

    fun withdraw(amount: Double) {
        println("Withdrawing money: $amount ...")
        if (amount > balance) {
            loading(false)
            println("\u001B[31m\nNot sufficient funds for withdraw reuest \u001B[0m\n")
            addTransactionHistory("Invalid request due to not sufficient funds")
            return
        }
        loading()
        balance -= amount
        addTransactionHistory("$accountHolder has withdrew $amount")
    }

    fun displayTransactionHistory() {
        println("Showing transaction history of $accountHolder's account:\n")
        for (transaction in transactions) {
            println("\t" + transaction)
        }
    }

    fun getBalance() {
        println("$accountHolder has $$balance in his account")
    }

    private fun addTransactionHistory(transaction: String) {
        transactions.add(transaction)
    }

    private fun loading(isSuccess: Boolean = true) {
        runBlocking {
            for (sec in 3 downTo 1) {
                delay(1000)
                println(sec)
            }
        }
        val color = if (isSuccess) "\u001B[32m" else "\u001B[31m"
        val resetColor = "\u001B[0m"
        if (isSuccess) {
            println("$color\nSuccess$resetColor\n")
        } else {
            println("$color\nError $resetColor")
        }
    }
}
