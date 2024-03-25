package Bank;
public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(int acc,String name,double balance,double interestRate){
        super(acc,name,balance);
        this.interestRate=interestRate;
    }
    public double calculateInterest(){

        return getBalance()*interestRate/100;
    }
    public void updateInterest(){
        setBalance(getBalance()+calculateInterest());
        //showBalance();
    }

}