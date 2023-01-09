package polymorphismapplication;
public class TeacherCreditManager extends BaseCreditManager{

    @Override
    public double creditCalculate(double amount) {
        amount = amount * 1.25;
        System.out.println("Teacher Credit Amaount: " );
        return amount;
    }
    
}
