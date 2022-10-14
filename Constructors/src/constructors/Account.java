package constructors;
public class Account {
    private String accountNo;
    private double balance;
    private String name;
    private String email;
    private String phoneNo;
    
    // constructor
    public Account(){
        System.out.println("My Constructor..");
    }
    
    public Account(String accountNo, double balance, String name, String email, String phoneNo){
        this.accountNo = accountNo;
        this.balance = balance;
        this.email = email;
        this.name = name;
        this.phoneNo = phoneNo;
    }
    
    public  void depositMoney(double amount){
        balance += amount;
        System.out.println("New balance " + balance);
    }
    public  void pullMoney(double amount){
        if(amount > 1500){
            System.out.println("You cannot withdraw more than 1500");  
        }
        if(balance - amount < 0){
            System.out.println("Not enough balance. Balance "+ balance);
        }
        else{
            balance -= amount;
            System.out.println("New balance " + balance);
        }
    }
   
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public String getAccountNo(){
        return accountNo; 
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }
    
    
}
