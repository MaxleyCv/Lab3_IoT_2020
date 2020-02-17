package ua.lviv.iot.weapons.model;

public class MLRS extends AutoTurningArms {
    public MLRS(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double calibre, int maxCartridgeCapacity, double minimumVolleyTimeInSeconds, double massInKg, double reloadingTimeInSeconds, double maxTurningSpeedInRadiansPerSecond) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, calibre, maxCartridgeCapacity, minimumVolleyTimeInSeconds, massInKg, reloadingTimeInSeconds, maxTurningSpeedInRadiansPerSecond);

    }

    public void setUnderfireTerritory(PolarCoordinate coordinate){
        System.out.println("Underfire territory is now (" + coordinate.getAngleToNormalInRadians() + ", " + coordinate.getDistanceToTargetInMeters() + ")");
    }
}
