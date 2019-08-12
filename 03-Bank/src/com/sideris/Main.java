package com.sideris;

public class Main {

    public static void main(String[] args) {

            Account myAccount = new Account("Christos Sideris", (582019), (6754986327L),
                    "christossid@mail.com", (1834.35));
            Account kwstasAccount = new Account("Kwstas Karantzinis", (978365), (3850482734L),
                    "kwstaskar@mail.com", (267.45));
            Account dadAccount = new Account("Dimitris Sideris", (567375), (8473628910L),
                    "dimitrissid@mail.com", (3756.68));
            VipCustomer timVIP = new VipCustomer();
            VipCustomer mumVIP = new VipCustomer("Theodwra Trianti", 80000.0,
                    "theodwratr@mail.com");


            myBank("\u0E3F");
            System.out.println("Customer name: " + myAccount.getCustomerName());
            System.out.println("Account number: " + myAccount.getAccountNumber());
            System.out.println("Email: " + myAccount.getEmail());
            System.out.println("Phone number: " + myAccount.getPhoneNumber());
            System.out.println("Balance: " + myAccount.getBalance() + "\u20AC");
            System.out.println(" ");
            myAccount.deposit(85);
            myAccount.deposit(43.8);
            myAccount.withdrawal(30.1);
            myAccount.withdrawal(1935);
            myAccount.deposit(10);
            myBank("\u0E3F");

            myBank("\u0E3F");
            System.out.println("Customer name: " + kwstasAccount.getCustomerName());
            System.out.println("Account number: " + kwstasAccount.getAccountNumber());
            System.out.println("Email: " + kwstasAccount.getEmail());
            System.out.println("Phone number: " + kwstasAccount.getPhoneNumber());
            System.out.println("Balance: " + kwstasAccount.getBalance() + "\u20AC");
            System.out.println(" ");
            kwstasAccount.withdrawal(42.31);
            myBank("\u0E3F");

            myBank("\u0E3F");
            System.out.println("Customer name: " + dadAccount.getCustomerName());
            System.out.println("Account number: " + dadAccount.getAccountNumber());
            System.out.println("Email: " + dadAccount.getEmail());
            System.out.println("Phone number: " + dadAccount.getPhoneNumber());
            System.out.println("Balance: " + dadAccount.getBalance() + "\u20AC");
            System.out.println(" ");
            dadAccount.deposit(246.87);
            dadAccount.withdrawal(137.45);
            myBank("\u0E3F");

            myBank("\u0E3F");
            System.out.println("VIP customer name: " + timVIP.getCustomerName());
            System.out.println("Email: " + timVIP.getEmailAddress());
            System.out.println("Credit limit: " + timVIP.getCreditLimit() + "\u20AC");
            System.out.println(" ");
            timVIP.payment(9745.0);
            myBank("\u0E3F");

            myBank("\u0E3F");
            System.out.println("VIP customer name: " + mumVIP.getCustomerName());
            System.out.println("Email: " + mumVIP.getEmailAddress());
            System.out.println("Credit limit: " + mumVIP.getCreditLimit() + "\u20AC");
            System.out.println(" ");
            mumVIP.payment(2000);
            myBank("\u0E3F");
        }
        public static void myBank (String bank){
            System.out.println(bank + "  " + bank + "  " + bank + "  " + bank + "  " + bank +
                    "  " + bank + "  " + bank + "  " + bank + "  " + bank + "  " + bank);
        }
    }
// "\u0E3F" = ฿  ,  "\u20AC" = €