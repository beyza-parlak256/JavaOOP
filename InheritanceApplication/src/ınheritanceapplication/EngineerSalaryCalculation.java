package ınheritanceapplication;
public class EngineerSalaryCalculation extends BaseSalaryCalculation{
    
    EngineerSalaryCalculation() {
    }
    
    // engineer için super içinde değer atadık
    public EngineerSalaryCalculation(int salary, int rate) {
        super(1000, 200); // super: base classa atıfta buluunmak
    }

    @Override
    public void salaryCalculation(){
        this.salary = (this.salary*rate)/20;
        System.out.println("Engineer Salary: " + this.salary);
    }
}
