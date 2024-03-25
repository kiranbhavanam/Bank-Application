package Bank;

public class Work{
    //Abstraction is achieved by utilising the methods of BankAccount
    // class without knowing the implementation details of them.
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount(2735,"kiran",1000.00);
       // BankAccount acc2=new BankAccount(2735,"kiran",1000.00);

    //    System.out.println(acc1.equals(acc1));
   /* System.out.println( acc1.getAccountNumber()+" : "+acc1.getBalance());
    acc1.deposit(2000);
    System.out.println(acc1.getBalance());
    acc1.withdraw(1000);

    acc1.withdraw(2001);
    System.out.println(acc1.getBalance());*/
    SavingsAccount s=new SavingsAccount(2736,"achyuth",4000,10);
    s.showBalance();
    s.updateInterest();
    
    s.withdraw(2400);
    s.showBalance();
    


    
    
    }
}