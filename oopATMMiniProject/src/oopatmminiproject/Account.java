package oopatmminiproject;
public class Account {
    private String userName;
    private String password;
    private int balance;

    public Account(String userName, String password, int balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    // para yatırma işlemi
    public void depositMoney(double amount){
        balance += amount;
        System.out.println("New balance " + balance);
    }
    
    // para çekme işlemi
    public void withdrawMoney(double amount){
        if((balance-amount) < 0){
            System.out.println("Insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println("New balance " + balance);
        }
    }
    
}
