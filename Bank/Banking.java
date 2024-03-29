package Bank;

import java.util.HashMap;

public class Banking{
    //Abstraction is achieved by utilising the methods of BankAccount
    // class without knowing the implementation details of them.
        private HashMap<Integer, Account> Accounts;
        public Banking(){
            Accounts=new HashMap<>();
        }
        public void createAccount(int accountNumber,String name,double balance){
            if(!Accounts.containsKey(accountNumber)){
                Account acc=new Account(accountNumber, name, balance);
                Accounts.put(accountNumber, acc);
                System.out.println("Account created succesfully");
            }
            else{
                System.out.println("Account already exists");
            }
        }
        public void depositToAccout(int accountNumber,double amount){
            Account acc=Accounts.get(accountNumber);
            if(acc!=null){
                acc.deposit(amount);
                System.out.println("Deposited to :"+accountNumber+" current balance: "+acc.getBalance());
            }
            else{
                System.out.println("account does not exist");
            }
        }
        public static void main(String[] args) {
        Banking rec=new Banking();
        rec.createAccount(1, "kiran", 1000);
        rec.createAccount(2, "achyuth", 20000);
        
        rec.depositToAccout(2, 1000);
        
  
    // SavingsAccount s=new SavingsAccount(2736,"achyuth",4000,10);
    }
}