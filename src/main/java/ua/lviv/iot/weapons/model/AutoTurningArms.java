package ua.lviv.iot.weapons.model;

public class AutoTurningArms extends FireArm{
    private double maxTurningSpeedInRadiansPerSecond;

    public double getCurrentTurnAngleInRadians() {
        return currentTurnAngleInRadians;
    }

    private double currentTurnAngleInRadians;

    public AutoTurningArms(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double calibre, int maxCartridgeCapacity, double minimumVolleyTimeInSeconds, double massInKg, double reloadingTimeInSeconds, double maxTurningSpeedInRadiansPerSecond) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, calibre, maxCartridgeCapacity, minimumVolleyTimeInSeconds, massInKg, reloadingTimeInSeconds);
        this.maxTurningSpeedInRadiansPerSecond = maxTurningSpeedInRadiansPerSecond;
        this.currentTurnAngleInRadians = 0;
    }

    public double getMaxTurningSpeedInRadiansPerSecond() {
        return maxTurningSpeedInRadiansPerSecond;
    }

    public void setMaxTurningSpeedInRadiansPerSecond(double maxTurningSpeedInRadiansPerSecond) {
        this.maxTurningSpeedInRadiansPerSecond = maxTurningSpeedInRadiansPerSecond;
    }

    public void turn(double angleInRadians){
        angleInRadians -= (int)(angleInRadians/6.28)*6.28;
        this.currentTurnAngleInRadians += angleInRadians;
        System.out.println("Current turn angle is: " + currentTurnAngleInRadians);
    }
}

