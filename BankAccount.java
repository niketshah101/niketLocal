package com.company;
public class bankAccount {
    private String accountNumber;
    private double balance;
    private String CustomerName;
    private String email;
    private String phoneNumber;

    public bankAccount(String accountNumber, double balance, String CustomerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance  =balance;
        this.CustomerName =CustomerName;
        this.email = email;
        this.phoneNumber =phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance +=depositAmount;
        System.out.println("Deposit of  "+depositAmount +"made. New balance is "+this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + "available. Withdrawal not possible");
        }
        else{
            this.balance -= withdrawalAmount;
                System.out.println("Withdrawal amount "+withdrawalAmount +"processed.Remaining balance" +this.balance);
            }
        }




    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}



public class Main {

    public static void main(String[] args) {


	bankAccount bobsAccount = new bankAccount("12354", 0.0, "Bob","bob@gmail.com","99665588" );
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhoneNumber());
	bobsAccount.withdrawal(100);
	bobsAccount.deposit(50);
	bobsAccount.deposit(51);
	bobsAccount.withdrawal(100);

    }
}
