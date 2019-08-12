package com.sideris;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public Account (String customerName,int accountNumber, long phoneNumber, String email, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.balance = balance;
    }

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "\u20AC processed. New balance: " +
                this.balance + "\u20AC");
    }
    public void withdrawal (double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "\u20AC processed. Remaining balance: " +
                    this.balance + "\u20AC");
        }
    }

    public void setAccountNumber (int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        if (balance < 0){
            System.out.println("Invalid balance value.");
            return this.balance = 0.0;
        } else {
            return this.balance;
        }
    }

    public void setEmail (String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber (long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
}