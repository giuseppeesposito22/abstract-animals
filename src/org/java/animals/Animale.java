package org.java.animals;

public abstract class Animale {

    protected String nome;
    protected String eta;
    protected float peso;


    


    public Animale(String nome, String eta, float peso) {
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





    public String getEta() {
        return eta;
    }





    public void setEta(String eta) {
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
