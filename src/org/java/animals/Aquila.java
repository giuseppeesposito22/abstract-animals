package org.java.animals;

public class Aquila extends Animale{

    private String lunghezzaBecco;


    public Aquila(String nome, String eta, float peso, String lunghezzaBecco) {
        super(nome, eta, peso);
        this.lunghezzaBecco = lunghezzaBecco;
       
    }


    


    @Override
    void verso() {
        System.out.println("Criii");;
    }

    @Override
    void mangia() {
       System.out.println("Mangio mammiferi, rettili e pesci");;
    }





    public String getLunghezzaBecco() {
        return lunghezzaBecco;
    }





    public void setLunghezzaBecco(String lunghezzaBecco) {
        this.lunghezzaBecco = lunghezzaBecco;
    }




}
