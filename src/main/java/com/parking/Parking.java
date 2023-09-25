package com.parking;

import java.util.ArrayList;

public class Parking {
    // gérer la place du parking
    // connaitre le nombre de place disponibles
    // connaitre le liste des vehicule autorisé et ceux qui sont stationnés dans le
    // parking

    private int capaciteMaximale;
    // private int nbPlacesDisponibles;
    private ArrayList<String> vehiculesAutorises;
    private ArrayList<String> vehiculesStationnes;

    // limite au nmbre de vehicule autorisé
    // capacite maximale
    public Parking(int capacite) {
        this.capaciteMaximale = capacite; // ou on met juste capaciteMaximale = capacite
        vehiculesAutorises = new ArrayList<>(); // liste vide; on met juste() pour montrer que c'est vide
        vehiculesStationnes = new ArrayList<>();
    }

    public ArrayList<String> getVehiculesAutorises() {
        return vehiculesAutorises;
    }

    // pour pouvoir obtenir la taille
    public int getTailleVehiculesAutorises() {
        return vehiculesAutorises.size();
    }

    public int getTailleVehiculesStationnes() {
        return vehiculesStationnes.size();
    }

    // ajouter l'immatriculation
    public boolean ajouterVehiculesAutorises(String immatriculation) {
        vehiculesAutorises.add(immatriculation);
        return true;

    }

    // enregistrer entree vehicule
    public boolean enregistrerEntreeVehicule(String immatriculation) {
        if (vehiculesAutorises.contains(immatriculation)) {
            vehiculesAutorises.add(immatriculation);
            return true;
        } else {
            return false;
        }
    }
    // public boolean enregistrerEntreeVehicule(String immatriculation) {
    // for (String imm : vehiculesAutorises) {
    // if (imm.equals(immatriculation)) {
    // return true;
    // }
    // }
    // return false;
    // }

    // enregistrer sortie vehicule
    public void enregistrerSortieVehicule(String immatriculation) {
        for (String imm : vehiculesStationnes) {
            if (imm.equals(immatriculation)) {
                System.out.println(
                        "le vehicule qui a pour immatriculation" + immatriculation + "est enregistré à la sortie");
            } else {
                System.out.println("le vehicule n'est pas enregister à la sortie");
            }

        }

    }

    public boolean enregistrerSortie(String immatriculation) {
        return vehiculesStationnes.remove(immatriculation);

    }

    // savoir si le vehicule est stationne ou pas
    public boolean estStationne(String immatriculation) {
        if (immatriculation.equals(immatriculation)) {
            return true;
        } else {
            return false;
        }

    }

    // le parking est plein ou pas
    public boolean estPlein() {
        if (vehiculesStationnes.size() == capaciteMaximale) {
            return true;
        } else {
            return false;
        }

    }

    // connaitre le nombre de vehicule dans le parking
    public int getNombresDeVehiculesStationnes() {
        return vehiculesStationnes.size();
    }

    // liste des vehicules actuellement present
    public ArrayList<String> getVehiculesStationnes() {
        return vehiculesStationnes;
    }

    public void getListVehiculesStationnes(String Immatriculation) {
        for (String imm : vehiculesStationnes) {
            System.out.println(vehiculesStationnes.size());

        }
    }

    // liste des vehicules autorisés
    public ArrayList<String> getListVehiculesAutorises() {
        return vehiculesAutorises;
    }

}
