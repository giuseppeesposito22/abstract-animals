package org.java.animals;

public class Cane extends Animale{

    private String lunghezzaPelo;
    private int numeroZampe;






    public Cane(String nome, String eta, float peso, String lunghezzaPelo, int numeroZampe) {
        super(nome, eta, peso);
        this.lunghezzaPelo = lunghezzaPelo;
        this.numeroZampe = numeroZampe;
    }


    



    public String getlunghezzaPelo() {
        return lunghezzaPelo;
    }






    public void setlunghezzaPelo(String lunghezzaPelo) {
        this.lunghezzaPelo = lunghezzaPelo;
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
