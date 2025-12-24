package ht.ueh.first.java;

public class BankAccount {
 private int accountNumber;
 private double balance;

public BankAccount(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance       = balance; 
}

public int  getaccountNumber() {
    return accountNumber;
}

public  void setaccountnumber(int accountNumber){
    this.accountNumber = accountNumber;
}

 public double getbalance() {
    return balance;
 }
 public void setbalance(double balance){
    this.balance = balance;
 }

public double deposit (double amount) {
    balance = amount + getbalance();
   System.out.println("La nouvelle balance est : " + balance );
   return balance;
}
public synchronized double withdraw (double amount){
if (amount <= balance)
{
     balance = getbalance() - amount;
     System.out.println("Retrait " + " de " + amount + " fait avec succes, votre balance est : " + balance + ".");
}
else{
 System.out.println(" Vous n'avez pas assez d'argent pour faire ce retrait.");
    System.out.println("Votre somme est : " + balance + " et vous ne pouvez retirer la somme de  " + amount  + ".");
}
    return balance;
}

}
