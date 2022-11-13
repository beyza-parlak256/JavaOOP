package inheritance2;
public class Animal {
    private String name;
    private int weight;
    private int size;
    private int numberLegs;
    
    public Animal(String name, int weight, int size, int numberLegs){
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.numberLegs = numberLegs;
    }
    
    public void food(){
        System.out.println("The animal is eating..");
    }
    
    public  void move(int speed){
        System.out.println("Moving with " + speed + " animal..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberLegs() {
        return numberLegs;
    }

    public void setNumberLegs(int numberLegs) {
        this.numberLegs = numberLegs;
    }
            
}
