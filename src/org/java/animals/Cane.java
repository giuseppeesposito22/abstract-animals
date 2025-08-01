package org.java.animals;

public class Cane extends Animale{

    private String pelo;
    private int numeroZampe;






    public Cane(String nome, String eta, float peso, String pelo, int numeroZampe) {
        super(nome, eta, peso);
        this.pelo = pelo;
        this.numeroZampe = numeroZampe;
    }


    



    public String getPelo() {
        return pelo;
    }






    public void setPelo(String pelo) {
        this.pelo = pelo;
    }






    public int getNumeroZampe() {
        return numeroZampe;
    }






    public void setNumeroZampe(int numeroZampe) {
        this.numeroZampe = numeroZampe;
    }






    @Override
    void verso() {
       System.out.println("Bau bau");;
    }

    @Override
    void mangia() {
       System.out.println("Mangio croccantini");;
    }

    



}
