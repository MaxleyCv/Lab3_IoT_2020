package ua.lviv.iot.weapons.model;

public class Riffle extends InfantryGuns{
    public Riffle(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double calibre, int maxCartridgeCapacity, double minimumVolleyTimeInSeconds, double massInKg, double reloadingTimeInSeconds) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, calibre, maxCartridgeCapacity, minimumVolleyTimeInSeconds, massInKg, reloadingTimeInSeconds);
    }

    public void hangOnShoulder(){
        System.out.println("The soldier is riffled!");
    }

    public String getHeaders(){
        return super.getHeaders();
    }

    public String toCSV(){
        return super.toCSV();
    }
}
