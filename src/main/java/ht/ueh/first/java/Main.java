package ht.ueh.first.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Please see the readme for your assignation");

    BankAccount Pierre = new BankAccount (123, 1000);
    ATMTask tache1 = new ATMTask(Pierre, "withdraw", 700);
    Thread pierre1 = new Thread(tache1);
    Thread pierre2 = new Thread(tache1);
    pierre1.start();
    pierre2.start();
    System.out.println("Test acheve!");
    }

}