package org.java.animals;

import org.java.animals.interfaces.IVola;

public class Aquila extends Animale implements IVola{

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





    @Override
    public void vola() {
        System.out.println("Sto volando!!!");;
    }




}
