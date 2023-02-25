package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
     void deposit_100() {

        // Arrange
        Account myAccount = new Account();

        // Act
        myAccount.deposit(100);
        double actual = myAccount.accountBalance;

        // Assert
        double expected = 100;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void withdrawFromEmptyAccount() {
        // Arrange
        Account myAccount = new Account();

        // Act
        double actual = myAccount.withdraw(100);

        // Assert
        double expected = 0.0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void withdraw_100_dollars() {
        // Arrange
        Account myAccount = new Account();
        myAccount.deposit(100);

        // Act
        double actual = myAccount.withdraw(100);

        // Assert
        double expected = 100;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void deposit_withdraw_checkBalance() {
        // Arrange
        Account myAccount = new Account();
        myAccount.deposit(100);
        myAccount.withdraw(100);

        // Act
        double actual = myAccount.getAccountBalance();

        // Assert
        double expected = 0;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void getAccountBalance() {
        // Arrange
        Account myAccount = new Account();
        myAccount.deposit(100);

        // Act
        double actual = myAccount.getAccountBalance();

        // Assert
        double expected = 100;
        Assertions.assertEquals(expected, actual);
    }
}