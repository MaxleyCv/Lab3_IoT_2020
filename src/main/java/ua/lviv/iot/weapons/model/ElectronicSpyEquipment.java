package ua.lviv.iot.weapons.model;

public class ElectronicSpyEquipment extends SpyEquipment {
    private double batteryCapacityInHours;
    private double screenDiagonalInInches;

    public ElectronicSpyEquipment(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double maximumDetectionDistanceInMeters, Size sizeInCentimiters, double batteryCapacityInHours, double screenDiagonalInInches) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, maximumDetectionDistanceInMeters, sizeInCentimiters);
        this.batteryCapacityInHours = batteryCapacityInHours;
        this.screenDiagonalInInches = screenDiagonalInInches;
    }

    public double getBatteryCapacityInHours() {
        return batteryCapacityInHours;
    }

    public void setBatteryCapacityInHours(double batteryCapacityInHours) {
        this.batteryCapacityInHours = batteryCapacityInHours;
    }

    public double getScreenDiagonalInInches() {
        return screenDiagonalInInches;
    }

    public void setScreenDiagonalInInches(double screenDiagonalInInches) {
        this.screenDiagonalInInches = screenDiagonalInInches;
    }
}
