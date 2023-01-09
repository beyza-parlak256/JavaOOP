package ınheritanceapplication;
public class BaseSalaryCalculation {
    public int salary;
    public int rate;

    public BaseSalaryCalculation() {
    }
    
    public BaseSalaryCalculation(int salary, int rate) {
        this.salary = salary; // maas
        this.rate = rate; // oran
    }
 
    public void salaryCalculation(){
        // fix formule
        this.salary = (this.salary * rate) / 20;
        System.out.println(this.salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    
}
