package constructors;
public class Constructors {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("12345", 1000, "Beyza PARLAK", "b@gmail.com", "123789456");
    
        account2.depositMoney(500);
        account2.pullMoney(1500);
    
    
    }
    
}
