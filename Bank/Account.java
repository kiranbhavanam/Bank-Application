package Bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    // displaying encapsulation by binding the data and the methods
    // that operate on that data into a single unit i.e a class
    
    private int accountNumber;
    private String  name;
    private double balance;
    private List<Transaction> transactionList;
 

    public Account(int accountNumber,String name,double balance){
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;
        this.transactionList=new ArrayList<>();
    }
    
    public List<Transaction> geTransactionHistory(){
        return transactionList;
    }
    public void addTransaction(Transaction transaction){
        transactionList.add(transaction);
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
   
    public double  getBalance(){

        return balance;
    }
    public void showBalance(){
        System.out.println("Your current balance is: "+balance);

    }
    public void deposit(double amount){
        balance+=amount;
        addTransaction(new Transaction("Deposit: ", amount));
        System.out.println("amount deposited: "+amount);
        getBalance();
    }
    public void withdraw(double amount){
        if(balance>=amount){

            balance-=amount;
            addTransaction(new Transaction("withdraw: ", amount));
            System.out.println("succesfully withdrwan.");
        }
        else
            System.out.println("insufficient balance");
    }

}
class Transaction{
    private String type;
    private double amount;

    public Transaction(String type, double amount){
        this.type=type;
        this.amount=amount;
    }
    public String toString(){
        return "{ "+type+amount +" }";
    }
}
