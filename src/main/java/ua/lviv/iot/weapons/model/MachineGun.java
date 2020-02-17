package ua.lviv.iot.weapons.model;

public class MachineGun extends InfantryGuns {
    public MachineGun(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double calibre, int maxCartridgeCapacity, double minimumVolleyTimeInSeconds, double massInKg, double reloadingTimeInSeconds) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, calibre, maxCartridgeCapacity, minimumVolleyTimeInSeconds, massInKg, reloadingTimeInSeconds);
    }

    public void setOnField(){
        System.out.println("Your machine gun is placed on the field");
    }
}
