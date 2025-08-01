package org.java.animals;

import org.java.animals.interfaces.INuota;

public class Delfino extends Animale implements INuota{
    
    private boolean isAddestrato;

    public Delfino(String nome, int eta, float peso, boolean isAddestrato) {
        super(nome, eta, peso);
        this.isAddestrato = isAddestrato;
    }


    


    @Override
    public void verso() {
       System.out.println("Click");;
    }

    @Override
    public void mangia() {
       System.out.println("Mangio pesci e creostacei");;
    }





    public boolean isAddestrato() {
        return isAddestrato;
    }





    public void setAddestrato(boolean isAddestrato) {
        this.isAddestrato = isAddestrato;
    }





    @Override
    public void nuota() {
       System.out.println("Sto nuotando!!!");;
    }



}
