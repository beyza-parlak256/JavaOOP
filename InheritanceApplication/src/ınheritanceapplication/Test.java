package ınheritanceapplication;
public class Test {
    public static void main(String[] args) {
        // hiyerarşi varsa inheritance vardır
        
        System.out.println("Welcome to Inheritance Application");
        
        System.out.println("--------------------------------------");
        
        EngineerSalaryCalculation engineer1 = new EngineerSalaryCalculation(1000,200);
        engineer1.salaryCalculation();
        
        System.out.println("--------------------------------------");
        
        ManagerSalaryCalculation manager1 = new ManagerSalaryCalculation(1000, 300);
        manager1.salaryCalculation();
        
        System.out.println("--------------------------------------");
        
        TreasurerSalaryCalculation treasurer = new TreasurerSalaryCalculation(1000, 150);
        treasurer.salaryCalculation();
        
        
        
        
    }
    
}
