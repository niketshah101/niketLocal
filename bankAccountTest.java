package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {

       bankAccount account =new bankAccount("Niket","Shah",1000.00,bankAccount.CHECKING);
       double balance = account.deposit(200.00,true);
       assertEquals(1200.00, balance, 0);

    }
    @org.junit.jupiter.api.Test
    public void getbalance_deposit() throws  Exception{
    bankAccount account = new bankAccount("Niket","Shah",1000.00,bankAccount.CHECKING);
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00, account.getBalance(), 0);
    }
    @org.junit.jupiter.api.Test
    public void getbalance_withdrawal() throws  Exception{
        bankAccount account = new bankAccount("Niket","Shah",1000.00,bankAccount.CHECKING);
        double balance = account.withdrawal(200.00,true);
        assertEquals(800, account.getBalance(), 0);
    }


    @org.junit.jupiter.api.Test
    public void Checking_false(){
        bankAccount account = new bankAccount("Niket","Shah",1000.00,bankAccount.SAVINGS);
        assertTrue(account.checking(),"The account is NOT a savings account");
    }

    @org.junit.jupiter.api.Test
    void withdrawal() {
        fail("The test has yet to be implemented");
    }

}