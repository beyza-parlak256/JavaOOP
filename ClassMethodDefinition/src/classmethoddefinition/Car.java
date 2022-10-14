package classmethoddefinition;
public class Car {
    private String color;
    private int doors;
    private int wheels;
    private String engine;
    private String model;
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    
    public void setDoors(int doors){
        if(doors < 0){
            System.out.println("Doors cannot be less than 0");
        }
        else{
            this.doors = doors;
        }
    }
    public int getDoors(){
        return this.doors;
    }
    
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public int getWheels(){
        return this.wheels;
    }
    
    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getEngine(){
        return this.engine;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    
    
    
    
    
    
    
    
}
