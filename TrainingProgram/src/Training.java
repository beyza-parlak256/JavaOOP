public class Training {
    private int burpeeNumber;
    private int pushupNumber;
    private int situpNumber;
    private int squatNumber;

    // constructor
    public Training(int burpeeNumber, int pushupNumber, int situpNumber, int squatNumber) {
        this.burpeeNumber = burpeeNumber;
        this.pushupNumber = pushupNumber;
        this.situpNumber = situpNumber;
        this.squatNumber = squatNumber;
    }

    public int getBurpeeNumber() {
        return burpeeNumber;
    }

    public void setBurpeeNumber(int burpeeNumber) {
        this.burpeeNumber = burpeeNumber;
    }

    public int getPushupNumber() {
        return pushupNumber;
    }

    public void setPushupNumber(int pushupNumber) {
        this.pushupNumber = pushupNumber;
    }

    public int getSitupNumber() {
        return situpNumber;
    }

    public void setSitupNumber(int situpNumber) {
        this.situpNumber = situpNumber;
    }

    public int getSquatNumber() {
        return squatNumber;
    }

    public void setSquatNumber(int squatNumber) {
        this.squatNumber = squatNumber;
    }
    
    public void makeMove(String moveType, int number){
        if(moveType.equals("Burpee")){
            makeBurpee(number);
        }
        else if(moveType.equals("Pushup")){
            makePushup(number);
        }
        else if(moveType.equals("Situp")){
            makeSitup(number);
        }
        else if(moveType.equals("Squat")){
            makeSquat(number);
        }

        else{
            System.out.println("Invalid move..");
        }
    }
    
    public void makeBurpee(int number){
        if(burpeeNumber == 0){
            System.out.println("No more burpees to do");
        }
        if(burpeeNumber - number < 0){
            System.out.println("You passed your target number of burpees, congratulations ");
        }
        else{
            burpeeNumber -= number;
            System.out.println("Number of remaining burpees " + burpeeNumber);
        }
    }
    
    public void makePushup(int number){
        if(pushupNumber == 0){
            System.out.println("No more pushup to do");
        }
        if(pushupNumber - number < 0){
            System.out.println("You passed your target number of pushup, congratulations ");
        }
        else{
            pushupNumber -= number;
            System.out.println("Number of remaining pushup " + pushupNumber);
        }
    }
    
    public void makeSitup(int number){
        if(situpNumber == 0){
            System.out.println("No more situp to do");
        }
        if(situpNumber - number < 0){
            System.out.println("You passed your target number of situp, congratulations ");
        }
        else{
            situpNumber -= number;
            System.out.println("Number of remaining situp " + situpNumber);
        }
    }
    
    public void makeSquat(int number){
        if(squatNumber == 0){
            System.out.println("No more squat to do");
        }
        if(squatNumber - number < 0){
            System.out.println("You passed your target number of squat, congratulations ");
        }
        else{
            squatNumber -= number;
            System.out.println("Number of remaining squat " + squatNumber);
        }
    }
    
    // hepsi true olursa idman biter, biri false olursa idman bitmez
    public boolean trainingEnd(){
        return ((burpeeNumber == 0) && (pushupNumber == 0) && (situpNumber == 0) && (squatNumber == 0));
    }
}
