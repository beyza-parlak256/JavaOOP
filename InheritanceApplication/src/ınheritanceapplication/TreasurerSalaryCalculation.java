package ınheritanceapplication;
public class TreasurerSalaryCalculation extends BaseSalaryCalculation{

    public TreasurerSalaryCalculation(int salary, int rate) {
        super(1000, 90);
    }

    @Override
    public void salaryCalculation() {
        this.salary = ((this.salary * rate) / 20)+1000;
        System.out.println("Treasurer Salary: " + this.salary);
    }

    
    
    
    
    
}
