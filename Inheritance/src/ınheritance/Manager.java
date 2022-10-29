package ınheritance;
public class Manager extends Employee{ // subclass
    // her yönetici aynı zamanda çalışandır
    
    private int personsResponsible;
    
    public Manager(String name, int salary, String department, int personsResponsible) {
        super(name, salary, department);
        this.personsResponsible = personsResponsible;
    }
    
    public void raiseAmount(int raiseAmount){
        System.out.println("Managers " + raiseAmount + " raise has been made");
    }
    
    @Override
    public void informationsShow(){
        super.informationsShow();
        System.out.println("Persons Responsible : " + personsResponsible);
            
    }
    
    
}
