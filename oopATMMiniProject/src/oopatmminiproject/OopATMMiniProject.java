package oopatmminiproject;
/*
Login classı kullanıcı girişini kontrol edecek
Account classı hesap işlemlerini yapacak
ATM classı ATM yi çalıştıracak
*/
public class OopATMMiniProject {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account("Beyza", "xnamex", 12000);
        atm.work(account);
        System.out.println("Exiting the program..");
    }
    
}
