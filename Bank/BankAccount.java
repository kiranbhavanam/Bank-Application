package Bank;

public class BankAccount {
    // displaying encapsulation by binding the data and the methods
    // that operate on that data into a single unit i.e a class
    
    private int accountNumber;
    private String  name;
    private double balance;
    public BankAccount(int accountNumber,String name,double balance){
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double  getBalance(){

        return balance;
    }
    public void showBalance(){
        System.out.println("Your current balance is: "+balance);

    }
    public void deposit(double amount){
        balance+=amount;
        getBalance();
    }
    public void withdraw(double amount){
        if(balance>=amount)
            balance-=amount;
        else
            System.out.println("insufficient balance");
    }

}
