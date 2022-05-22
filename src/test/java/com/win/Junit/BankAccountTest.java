package com.win.Junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.win.junit.BankAccount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    // Test 2


    @DisplayName("test deposit() Method- if it returns correct account balance")
    @Test

    void depositTest(){

        BankAccount account = new BankAccount(0, "Vinita");

        account.deposit(500);

        assertTrue(account.getAccountBalance() == 500);

    }

    // Test 3

    @DisplayName("test deposit() Method- if it returns false if account balance is incorrect")
    @Test

    void withdrawTest(){
        BankAccount account = new BankAccount(500, "Vinita");

        account.withdraw(200);

        assertFalse(account.getAccountBalance() == 500);


    }


    
}
