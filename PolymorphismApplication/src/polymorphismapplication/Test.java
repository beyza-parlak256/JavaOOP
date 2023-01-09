package polymorphismapplication;
public class Test {
    public static void main(String[] args) {
        // Bir objenin farklı bir obje gibi davranabilmesidir
        // Base classı olan, birbirinin alternatifi olan ve ortak özellik barındıran classlarda kullanırız
        // is a - has a kalıtımdadır
        // is a: Üst sınıfa bağlanan alt sınıflarla alt sınıflar arasında IS-A ilişkisi vardır
        // has a: Bir sınıfın içerisinde başka bir sınıftan nesne oluşturulup o nesnenin özelliklerinin kullanılması
        
        
        // spesifik implementasyon
        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]
        {
            new EngineerCreditManager(),
            new StudentCreditManager(),
            new TeacherCreditManager()
        };
        
        // baseCreditManager'in içini geziyoruz
        for (BaseCreditManager creditManager: baseCreditManagers) {
            System.out.println(creditManager.creditCalculate(10000.0));
        }
        
    }
    
}
