package polymorphismapplication;
public class StudentCreditManager extends BaseCreditManager{

    @Override
    public double creditCalculate(double amount) {
        amount = amount * 1.13;
        System.out.println("Student Credit Amaount: " );
        return amount; 
    }
    
}
