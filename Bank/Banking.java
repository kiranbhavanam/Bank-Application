package Bank;

public class Banking{
    //Abstraction is achieved by utilising the methods of BankAccount
    // class without knowing the implementation details of them.
    public static void main(String[] args) {
        Account acc1=new Account(2735,"kiran",1000.00);

        System.out.println(acc1.geTransactionHistory());
        
  
    SavingsAccount s=new SavingsAccount(2736,"achyuth",4000,10);



    
    
    }
}