package ht.ueh.first.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Please see the readme for your assignation");

    BankAccount Pierre = new BankAccount (123, 1000);
    Pierre.deposit(125);
    Pierre.withdraw(200);
    Pierre.withdraw(250);
    Pierre.withdraw(10000);

    System.out.println("Test acheve!");
    }

}