package Bank;
public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(int acc,String name,double balance,double interestRate){
        super(acc,name,balance);
        this.interestRate=interestRate;
    }
    public double calculateInterest(){

        return getBalance()*interestRate/100;
    }
    public void updateInterest(){
        System.out.println("balance updated according to interest rate.");
        // setBalance(getBalance()+calculateInterest());
        //showBalance();
    }
    public String toString(){
        return "Employee {"+"name='"+getName()+'\''+", accountNumber "+getAccountNumber()+"}";
    }

}