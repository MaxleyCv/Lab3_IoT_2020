package ua.lviv.iot.weapons.model;

public class Mortar extends InfantryGuns {
    private String typeOfMines;

    public Mortar(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double calibre, int maxCartridgeCapacity, double minimumVolleyTimeInSeconds, double massInKg, double reloadingTimeInSeconds, String typeOfMines) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, calibre, maxCartridgeCapacity, minimumVolleyTimeInSeconds, massInKg, reloadingTimeInSeconds);
        this.typeOfMines = typeOfMines;
    }

    public String getTypeOfMines() {
        return typeOfMines;
    }

    public void setTypeOfMines(String typeOfMines) {
        this.typeOfMines = typeOfMines;
    }
}
