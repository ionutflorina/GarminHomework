package com.example.tema1


open class Bank(private var amount: Double) {
    open fun withdrawOperation(valWithdrawn: Double): Double {
        amount -= valWithdrawn
        return amount
    }

    fun depositOperation(valDep: Double): Double {
        amount += valDep
        println(amount)
        return amount
    }

    open fun paymentOperation(price: Double): Double {
        amount -= price
        return amount
    }
}

class DebitCard(private var balance: Double) : Bank(balance) {
    override fun withdrawOperation(valWithdrawn: Double): Double {
        if (balance > valWithdrawn) {
            balance -= valWithdrawn
            println("success")
        } else
            println("failure")
        return balance
    }
}

class CreditCard(private var amount: Double, var limit: Double) : Bank(limit) {
    override fun withdrawOperation(valWithdrawn: Double): Double {
        if (valWithdrawn <= limit) {
            amount -= valWithdrawn
            println("success")
        } else
            println("failure")
        return amount
    }

    override fun paymentOperation(price: Double): Double {
        withdrawOperation(price)
        amount += price / 100
        return amount
    }
}


