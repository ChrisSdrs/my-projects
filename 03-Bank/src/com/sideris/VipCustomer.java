package com.sideris;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Tim Buchalka", 500000.0, "timbuc@mail.com");
    }

    public void payment (double paymentAmount){
        if (this.creditLimit - paymentAmount < 0){
            System.out.println("Only " + this.creditLimit + " available. Payment not processed.");
        } else {
            this.creditLimit -= paymentAmount;
            System.out.println("Withdrawal of " + paymentAmount + "\u20AC processed. Remaining balance: " +
                    this.creditLimit + "\u20AC");
        }
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "unknown email");
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}