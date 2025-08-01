package org.java.animals;

import org.java.animals.interfaces.INuota;
import org.java.animals.interfaces.IVola;

public class Main {
  
        

     public static void faiVolare(IVola animale){
        animale.vola();
     }

     public static void faiNuotare(INuota animale){
        animale.nuota();
     }

     public static void main(String[] args) {
        
        Passerotto passerotto = new Passerotto("Cip", 1, 2, "marroni");
        Delfino delfino = new Delfino("Flipper", 10, 100, true);

        faiVolare(passerotto);
        faiNuotare(delfino);

    


     }
        
    
}
