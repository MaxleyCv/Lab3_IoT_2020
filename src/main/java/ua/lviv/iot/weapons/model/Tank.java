package ua.lviv.iot.weapons.model;

public class Tank extends ArmouredVehicle{
    private Gun gun;
    private int numberOfEntries;

    public Tank(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, Engine engine, double maxFieldVelocityInKmh, String model, double fuelSpendPerFieldKmInLitres, double maxAsphaltVelocityinKmh, double fuelTankCapacityInLitres, Armour armour, Gun gun, int numberOfEntries) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, engine, maxFieldVelocityInKmh, model, fuelSpendPerFieldKmInLitres, maxAsphaltVelocityinKmh, fuelTankCapacityInLitres, armour);
        this.gun = gun;
        this.numberOfEntries = numberOfEntries;
    }


    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }
}
