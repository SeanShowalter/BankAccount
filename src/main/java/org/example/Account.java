package org.example;

public class Account {
    double accountBalance;

    public Account() {
        this.accountBalance = 0.0;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public double withdraw(double amount) {
        if (amount > this.accountBalance) {
            return 0.0;
        } else {
            this.accountBalance -= amount;
        }

        return amount;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }
}

