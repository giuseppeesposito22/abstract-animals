package org.java.animals;

public class Passerotto extends Animale{

    private String colorePiume;


    public Passerotto(String nome, int eta, float peso, String colorePiume) {
        super(nome, eta, peso);
        this.colorePiume = colorePiume;
        
    }


    


    @Override
    public void verso() {
        System.out.println("Cip cip");;
    }

    @Override
    public void mangia() {
       System.out.println("Mangio vermetti");
    }





    public String getColorePiume() {
        return colorePiume;
    }





    public void setColorePiume(String colorePiume) {
        this.colorePiume = colorePiume;
    }
    


}
