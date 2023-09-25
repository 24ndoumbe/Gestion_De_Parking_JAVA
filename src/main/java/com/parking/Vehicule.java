package com.parking;

public class Vehicule {
    private String immatriculation;

    public Vehicule(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void changerImmatriculation(String immatriculatrion) {
        this.immatriculation = immatriculation;

    }

    public String getImmatriculation() {
        return immatriculation;

    }
}
