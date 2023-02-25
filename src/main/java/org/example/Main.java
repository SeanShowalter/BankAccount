package org.example;
public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account();

        myAccount.deposit(100.89);

        double withdrawAmount = myAccount.withdraw(50);
        System.out.println("Withdraw amount: " + withdrawAmount);

        double accountBalance = myAccount.getAccountBalance();
        System.out.println("Account Balance: " + accountBalance);

    }

}