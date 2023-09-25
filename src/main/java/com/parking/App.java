package com.parking;

public class App {

    public static void main(String[] args) {
        Vehicule voiture1 = new Vehicule("ABC-123");
        Vehicule voiture2 = new Vehicule("DEF-456");
        Vehicule voiture3 = new Vehicule("GHI-789");
        voiture1.changerImmatriculation("DCE-456");
        System.out.println(voiture1.getImmatriculation());

        Parking parking = new Parking(500);
        parking.ajouterVehiculesAutorises("DCE-456");
        parking.enregistrerEntreeVehicule("DCE-456");
        parking.enregistrerSortieVehicule("DCE-456");
        parking.estStationne("ABC-123");
        parking.estPlein();
        parking.getNombresDeVehiculesStationnes();
        parking.getListVehiculesStationnes("ABC-123");

    }

}
