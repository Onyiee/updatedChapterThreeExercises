package com.exerciseThreePointOneOne;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;

    @BeforeEach
    void setUp() {
        account = new Account("Bola",0.00);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void accountNameCanBeSet(){
        account.setAccountName("Bola");
        assertEquals("Bola",account.getAccountName());
    }

    @Test
    void accountBalanceCanBeset(){
        account.setAccountBalance(200.0);
        assertEquals(200.0,account.getAccountBalance());
    }

    @Test
    void accountCanAcceptDeposit(){
        account.setAccountBalance(200.00);
        account.makeDeposit(300.0);
        assertEquals(500.00,account.getAccountBalance());
    }

    @Test
    void accountCanMakeWithdrawal(){
        accountBalanceCanBeset();
        account.makeWithdrawal(800.00);
        accountCanAcceptDeposit();
//        account.makeWithdrawal(100.0);
//        assertEquals(400.00,account.getAccountBalance());
        assertThrows(ArithmeticException.class, () -> account.makeWithdrawal(800.00));
        System.out.println(account.getAccountBalance());
    }

}