package ınheritanceapplication;
public class ManagerSalaryCalculation extends BaseSalaryCalculation{

    public ManagerSalaryCalculation(int salary, int rate) {
        super(1000, 300);
    }

    @Override
    public void salaryCalculation() {
        // fix formule
        this.salary = (this.salary * rate) / 20;
        System.out.println("Manager Salary: " + this.salary);
    }
    
    
}
