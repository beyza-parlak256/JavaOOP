package polymorphismapplication;
public class EngineerCreditManager extends BaseCreditManager{

    @Override
    public double creditCalculate(double amount) {
        amount = amount * 1.27;
        System.out.println("Engineer Credit Amaount: " );
        return amount;
    }
    
}
