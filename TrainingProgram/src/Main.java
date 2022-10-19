
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Idman olusturma programi
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Training Program");
        
        String trainings = "Valid Transactions\n" +
                           "Burpee\n" +
                           "Pushup\n" +
                           "Situp\n" +
                           "Squat";
        System.out.println(trainings);
        
        System.out.println("Create a Workout");
        System.out.println("Berpee number : ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup number : ");
        int pushup = scanner.nextInt();
        System.out.println("Situp number : ");
        int situp = scanner.nextInt();
        System.out.println("Squat number : ");
        int squat = scanner.nextInt();
        scanner.nextLine();
        
        Training training = new Training(burpee, pushup, situp, squat);
        
        System.out.println("Your workout begins..");
        
        while(training.trainingEnd() == false){
            System.out.println("Move type (Berpee, Pushup, Situp, Squad)");
            String type = scanner.nextLine();
            System.out.println("How many of these moves will you do?");
            int number = scanner.nextInt();
            scanner.nextLine();
            
            training.makeMove(type, number);
            
        }
        
        
    }
}


