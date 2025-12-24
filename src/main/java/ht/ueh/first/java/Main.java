package ht.ueh.first.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("Please see the readme for your assignation");
        //Creation des comptes en banque
    BankAccount Pierre  = new BankAccount (123, 1000);
    BankAccount Jacques = new BankAccount(12, 45);
    BankAccount Jean    = new BankAccount(178, 0);

        //Tache et action dans la banque
    ATMTask tache1 = new ATMTask(Pierre, "withdraw", 700);
    ATMTask tache2 = new ATMTask(Jean, "deposit", 1200);
    ATMTask tache3 = new ATMTask(Jacques, "deposit", 15000);
    ATMTask tache4 = new ATMTask(Pierre, "balance", 0);
    ATMTask tache5 = new ATMTask(Jacques, "withdraw", 456);
    ATMTask tache6 = new ATMTask(Jean, "withdraw", 1400);

    Thread thread1 = new Thread(tache1);
    Thread thread2 = new Thread(tache2);
    Thread thread3 = new Thread(tache3);
    Thread thread4 = new Thread(tache4);
    Thread thread5 = new Thread(tache5);
    Thread thread6 = new Thread(tache6);

    thread1.start();
    System.out.println();
    thread2.start();
    System.out.println();
    thread3.start();
    System.out.println();
    thread4.start();
    System.out.println();
    thread5.start();
    System.out.println();
    thread6.start();

    System.out.println("Test acheve!");
    }

}