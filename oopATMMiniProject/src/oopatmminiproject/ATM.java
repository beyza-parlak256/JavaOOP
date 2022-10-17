package oopatmminiproject;

import java.awt.BorderLayout;
import java.util.Scanner;

public class ATM {
    public void work(Account account){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to our bank");
        System.out.println("----------------------------------------");
        System.out.println("User login");
        System.out.println("----------------------------------------");
        
        int rightEntry = 3; // giriş hakkı
        while (true){
            if(login.login(account)){
                System.out.println("Login successful");
                break;
            }
            else{
                System.out.println("Login failed");
                rightEntry --;
                System.out.println(rightEntry + " you have the right to enter!");
            }
            if(rightEntry == 0){
                System.out.println("Your login has expired");
                return;
            }
        }
        
        System.out.println("----------------------------------------");
        String operations = "1 - View Balance\n2 - Deposit Boney\n3 - Withdraw Money\n4 - Press q To Exit\n";
        System.out.println(operations);
        System.out.println("----------------------------------------");
        
        while (true) {
            System.out.println("Please select transaction");
            String operation = scanner.nextLine();
            if(operation.equals("q")){
                break;
            }
            else if(operation.equals("1")){
                System.out.println("Balance " + account.getBalance());
            }
            else if(operation.equals("2")){
                System.out.println("Amount you want to deposit");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.depositMoney(amount);
            }
            else if(operation.equals("3")){
                System.out.println("The amount you want to withdraw");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.depositMoney(amount);
            }
            else{
                System.out.println("Invalid transaction");
            }
        }
    }
}
