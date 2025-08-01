package org.java.animals;

public abstract class Animale {

    protected String nome;
    protected int eta;
    protected float peso;


    


    public Animale(String nome, int eta, float peso) {
        this.nome = nome;
        this.eta = eta;
        this.peso = peso;
    }


    


    public String getNome() {
        return nome;
    }





    public void setNome(String nome) {
        this.nome = nome;
    }





    public int getEta() {
        return eta;
    }





    public void setEta(int eta) {
        this.eta = eta;
    }





    public float getPeso() {
        return peso;
    }





    public void setPeso(float peso) {
        this.peso = peso;
    }





    public void dormi(){
        System.out.println("Zzz");
    }


    abstract void verso();
    abstract void mangia();


}
