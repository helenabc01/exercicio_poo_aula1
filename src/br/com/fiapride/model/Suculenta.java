package br.com.fiapride.model;

public class Suculenta {
    public String especie;
    public int nivelAgua; // escala da necessidade de rega
    public boolean solConstante;

    public Suculenta(String especie, int nivelAgua, boolean solConstante){
        this.especie = especie;
        this.nivelAgua = nivelAgua;
        this.solConstante = solConstante;
    }

    public String getEspecie() {
        return especie;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public boolean isSolConstante() {
        return solConstante;
    }

    public void regar() {
        if (this.nivelAgua >= 3) {
            System.out.println(this.especie + " está sendo regada!");
            this.nivelAgua = 1; // após regar, a planta fica hidratada
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
