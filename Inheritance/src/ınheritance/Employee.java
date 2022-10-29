package ınheritance;
public class Employee { // superclass / base class
    private  String name;
    private int salary;
    private String department;
    
    public Employee(String name, int salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    
    public void Emp(){
        System.out.println("Employee is working");
    }
    
    public void informationsShow(){
        System.out.println("Employee Name : " + name);
        
        System.out.println("Employee Salary : " + salary);
        
        System.out.println("Employee Department : " + department);
    }
    
    public void departmentChange(String newDepartment){
        System.out.println("Department is changing...");
        
        this.setDepartment(newDepartment);
        
        System.out.println("New departmen : " + this.getDepartment());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
