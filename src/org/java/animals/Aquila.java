package org.java.animals;

public class Aquila extends Animale{

    private String lunghezzaBecco;


    public Aquila(String nome, int eta, float peso, String lunghezzaBecco) {
        super(nome, eta, peso);
        this.lunghezzaBecco = lunghezzaBecco;
       
    }


    


    @Override
    public void verso() {
        System.out.println("Criii");;
    }

    @Override
    public void mangia() {
       System.out.println("Mangio mammiferi, rettili e pesci");;
    }





    public String getLunghezzaBecco() {
        return lunghezzaBecco;
    }





    public void setLunghezzaBecco(String lunghezzaBecco) {
        this.lunghezzaBecco = lunghezzaBecco;
    }




}
