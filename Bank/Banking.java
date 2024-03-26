package Bank;

public class Banking{
    //Abstraction is achieved by utilising the methods of BankAccount
    // class without knowing the implementation details of them.
    public static void main(String[] args) {
        Account acc1=new Account(2735,"kiran",1000.00);
  
    SavingsAccount s=new SavingsAccount(2736,"achyuth",4000,10);
    // s.showBalance();
    // s.updateInterest();
    
    // s.withdraw(2400);
    // s.showBalance();
    System.out.println(s);
    System.out.println(s.toString());


    
    
    }
}