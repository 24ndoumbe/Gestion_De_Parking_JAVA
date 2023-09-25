package com.parking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ParkingTest {

    @Test
    // contexte_methoseSousTest_resultat
    public void vehiculesAutorisesVide_ajouterVehiculeAutorise_devraitAjouterLeVehicule() {
        // arranger
        Parking parking = new Parking(0);
        // agir
        // on met le parametre
        parking.ajouterVehiculesAutorises("ABC-123");
        // assert //en jaune la methode qu'on appelle sur parking // en rouge le message
        assertEquals(1, parking.getTailleVehiculesAutorises(), "je devrait avoir exactement un vehicule autorisé");
        assertEquals("ABC-123", parking.getVehiculesAutorises().get(0),
                "l'immatriculation enregistrée n'est pas correcte");
    }

    @Test
    public void vehiculesAutorises_EnregistrerEntreeVehicule_devraitRentrer() {
        // arranger
        Parking parking = new Parking(0);
        // agir
        parking.ajouterVehiculesAutorises("DCE-456");
        // assert
        assertEquals(1, parking.getTailleVehiculesAutorises());
    }

    @Test
    public void vehiculeNonAutorise_EnregistrerEntree_devraitPasRentrer() {
        // arranger
        Parking parking = new Parking(1);
        parking.ajouterVehiculesAutorises("ABC-123");
        // agir
        parking.enregistrerEntreeVehicule("DCE-456");
        // assert
        assertEquals(false, parking.getTailleVehiculesStationnes(), "le vehicule ne devrait accéder");

    }

    @Test
    public void vehiculesAutorisesParkingPlein_enregistrerEntreeVehicule_devraitPasRentrer() {
        // arranger
        Parking parking = new Parking(2);
        parking.ajouterVehiculesAutorises("ABC-123");
        parking.ajouterVehiculesAutorises("DCE-456");
        parking.enregistrerEntreeVehicule("DCE-456");

        // agir
        parking.enregistrerEntreeVehicule("DCE-456");
        // assert
        assertEquals(false, parking.getTailleVehiculesStationnes(), "le parking est plein");

    }

    @Test
    public void nombresDeVehiculesStationnes_sontPresent() {
        // arranger
        Parking parking = new Parking(1);
        // parking.getNombresDeVehiculesStationnes();

        // agir
        int res = parking.getNombresDeVehiculesStationnes();
        // assert
        assertEquals(0, res, "nombres de vehicules presents");
    }

    // tester avec 1 vehicule
    @Test
    public void nombresDeVehiculesStationnes_retirerVehicule_sontPresentSurLeParking() {
        // arranger
        Parking parking = new Parking(2);
        // parking.getNombresDeVehiculesStationnes();

        parking.ajouterVehiculesAutorises("ABC-123");
        parking.enregistrerEntreeVehicule("ABC-123");
        parking.ajouterVehiculesAutorises("DCE-456");
        parking.enregistrerEntreeVehicule("DCE-456");

        // agir
        int res = parking.getNombresDeVehiculesStationnes();
        // assert
        assertEquals(1, res, "nombres de vehicules presents");
    }

    @Test
    public void vehiculesStationnes_enregistrerSortie_IlEstSorti() {
        // Arranger

        Parking parking = new Parking(1);
        parking.ajouterVehiculesAutorises("ABC-123");
        parking.enregistrerEntreeVehicule("ABC-123");

        // Agir

        parking.enregistrerSortie("ABC-123");

        // Assert

        assertEquals(0, parking.getTailleVehiculesStationnes());

    }

    @Test
    public void vehiculeNonPresent_enregistrerSortieVehicule_pasDansLeParking() {
        // Arranger

        Parking parking = new Parking(2);
        parking.ajouterVehiculesAutorises("ABC-123");
        parking.ajouterVehiculesAutorises("DCE-456");
        parking.enregistrerEntreeVehicule("ABC-123");

        // Agir

        parking.enregistrerSortieVehicule("ABC-123");

        // Assert

        assertEquals(1, parking.getTailleVehiculesStationnes());

    }

}
