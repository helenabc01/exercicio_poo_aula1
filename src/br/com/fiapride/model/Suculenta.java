package br.com.fiapride.model;

public class Suculenta {
    private String especie;
    private int nivelAgua;
    private boolean solConstante;

    public Suculenta(String especie, int nivelAgua, boolean solConstante){
        this.especie = especie;
        this.setNivelAgua(nivelAgua); // usa o setter para validar
        this.solConstante = solConstante;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(int nivelAgua) {
        if (nivelAgua < 0) {
            System.out.println("Nivel de água não pode ser negativo!");
        } else {
            this.nivelAgua = nivelAgua;
        }
    }

    public boolean isSolConstante() {
        return solConstante;
    }

    public void setSolConstante(boolean solConstante) {
        this.solConstante = solConstante;
    }

    public void regar() {
        if (this.nivelAgua >= 3) {
            System.out.println(this.especie + " está sendo regada!");
            this.nivelAgua = 1;
        } else {
            System.out.println(this.especie + " já foi regada recentemente!");
        }
    }

    public void tomarSol() {
        if (solConstante) {
            System.out.println(this.especie + " está recebendo sol.");
            this.nivelAgua += 1;
        } else {
            System.out.println(this.especie + " não precisa de sol constante.");
        }
    }
}