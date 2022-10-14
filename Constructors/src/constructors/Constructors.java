package constructors;
public class Constructors {
    public static void main(String[] args) {
        Account account1 = new Account();
        //System.out.println(account1.getEmail());
        Account account2 = new Account("Beyza Parlak","beyza@gmail.com","123789456");
           
        //System.out.println(account2.getEmail());
        //System.out.println(account2.getName());
        
        account2.informationShow();    }
    
}
