package org.java.animals;

public class Cane extends Animale{

    private String lunghezzaPelo;
    






    public Cane(String nome, int eta, float peso, String lunghezzaPelo) {
        super(nome, eta, peso);
        this.lunghezzaPelo = lunghezzaPelo;
      
    }


    



    public String getlunghezzaPelo() {
        return lunghezzaPelo;
    }






    public void setlunghezzaPelo(String lunghezzaPelo) {
        this.lunghezzaPelo = lunghezzaPelo;
    }









    @Override
    public void verso() {
       System.out.println("Bau bau");;
    }

    @Override
    public void mangia() {
       System.out.println("Mangio croccantini");;
    }

    



}
