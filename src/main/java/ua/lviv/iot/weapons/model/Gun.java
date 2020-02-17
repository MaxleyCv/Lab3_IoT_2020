package ua.lviv.iot.weapons.model;

public class Gun extends AutoTurningArms {
    private double lengthOfMuzzleInMeters;

    public Gun(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double calibre, int maxCartridgeCapacity, double minimumVolleyTimeInSeconds, double massInKg, double reloadingTimeInSeconds, double maxTurningSpeedInRadiansPerSecond, double lengthOfMuzzleInMeters) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, calibre, maxCartridgeCapacity, minimumVolleyTimeInSeconds, massInKg, reloadingTimeInSeconds, maxTurningSpeedInRadiansPerSecond);
        this.lengthOfMuzzleInMeters = lengthOfMuzzleInMeters;
    }

    public double getLengthOfMuzzleInMeters() {
        return lengthOfMuzzleInMeters;
    }

    public void setLengthOfMuzzleInMeters(double lengthOfMuzzleInMeters) {
        this.lengthOfMuzzleInMeters = lengthOfMuzzleInMeters;
    }
}
