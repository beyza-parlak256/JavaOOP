package abstractionapplication;
public class Test {
    public static void main(String[] args) {
        // kullanıcı, nesnenin nasıl yaptığını değil ne yaptığını bilir
        // implementasyon detayları gizlenir, sadece fonksiyonellik sağlanır
        
        
        BaseScoreCalculator man = new ManScoreCalculator();
        man.gameOver();
        man.scoreCalculate();
        
        System.out.println("*************************");
        
        BaseScoreCalculator woman = new WomanScoreCalculator();
        woman.gameOver();
        woman.scoreCalculate();
        
        System.out.println("*************************");
        
        BaseScoreCalculator child = new ChildScoreCalculator();
        child.gameOver();
        child.scoreCalculate();
        
        
        
    }
    
}
