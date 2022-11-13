package inheritance2;
public class Dog extends Animal{
    private int numberTeeth;

    public Dog(String name, int weight, int size, int numberLegs, int numberTeeth) {
        super(name, weight, size, numberLegs);
        this.numberTeeth = numberTeeth;
    }
    
    public void run(int speed){
        System.out.println("The dog is running..");
        move(speed);
    }

    public int getNumberTeeth() {
        return numberTeeth;
    }

    public void setNumberTeeth(int numberTeeth) {
        this.numberTeeth = numberTeeth;
    }
    
}
