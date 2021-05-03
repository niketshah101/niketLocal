package com.company;

public class bankAccount {
    private String firsName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;
    public bankAccount(String firsName, String lastName, double balance, int typeOfAccount){
        this.firsName=firsName;
        this.lastName=lastName;
        this.balance=balance;

        this.accountType = typeOfAccount;
    }
    // this branch argument is true if customer is performing transaction
    // at a branch, with a teller;
    // it's false if the customer is performing the transaction at an atm
    public double deposit(double amount, boolean branch){
    balance+=amount;
    return balance;
    }
    // this branch argument is true if customer is performing transaction
    // at a branch, with a teller;
    // it's false if the customer is performing the transaction at an atm
    public double withdrawal(double amount, boolean branch){
        balance-=amount;
        return balance;
    }
    public double getBalance(){
        return balance;
    }
    public boolean checking(){
        return accountType ==CHECKING;
    }



    // More methods for firstName, lastName, and perform other functions
}
