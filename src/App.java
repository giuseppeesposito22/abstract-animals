import org.java.animals.Cane;
import org.java.animals.Delfino;

public class App {
    public static void main(String[] args) throws Exception {
        

        Delfino flipper = new Delfino("Flipper", 10, 100, true);
       
        flipper.verso();
        flipper.mangia();
        flipper.dormi();

        Cane fuffy = new Cane("Fuffy", 5, 50, "medio");

        fuffy.verso();
        fuffy.mangia();
        fuffy.dormi();



    }
}
