package org.java.animals;

public class Passerotto extends Animale{

    private String colorePiume;


    public Passerotto(String nome, String eta, float peso, String colorePiume) {
        super(nome, eta, peso);
        this.colorePiume = colorePiume;
        
    }


    


    @Override
    void verso() {
        System.out.println("Cip cip");;
    }

    @Override
    void mangia() {
       System.out.println("Mangio vermetti");
    }





    public String getColorePiume() {
        return colorePiume;
    }





    public void setColorePiume(String colorePiume) {
        this.colorePiume = colorePiume;
    }
    


}
