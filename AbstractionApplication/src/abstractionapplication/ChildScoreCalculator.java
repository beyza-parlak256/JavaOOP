package abstractionapplication;
public class ChildScoreCalculator extends BaseScoreCalculator{

    @Override
    public void scoreCalculate() {
        System.out.println("Your score: " + 85);
    }
    
}
