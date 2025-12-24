package ht.ueh.first.java;

public class ATMTask implements Runnable {
private BankAccount account;
private String action;
private double montant;

public ATMTask (BankAccount account , String action, double montant ){
   this.account = account;
   this.action  = action;
   this.montant = montant;
}

public BankAccount getaccount(){
    return account;
}

public void  setaccount(BankAccount account){
    this.account = account;
}
public String getaction(){
    return action;
}
public void setaction(String action){
    this.action = action;
}
public double getmontant(){
    return montant;
}
public void setmontant(double montant){
    this.montant = montant ;
}

@Override
public void run(){
    if (action.equalsIgnoreCase("withdraw")){
        account.withdraw(montant);
    }
    else if (action.equalsIgnoreCase("deposit")){
        account.deposit(montant);
    }
   else if (action.equalsIgnoreCase("balance")){
        account.getbalance();
        System.out.print("Votre balance est : " + account.getbalance() + ".");
    }
}

}
