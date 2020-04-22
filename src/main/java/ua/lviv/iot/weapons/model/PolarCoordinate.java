package ua.lviv.iot.weapons.model;

public class PolarCoordinate {
    private double distanceToTargetInMeters;
    private double angleToNormalInRadians;

    public PolarCoordinate(double distanceToTargetInMeters, double angleToNormalInRadians) {
        this.distanceToTargetInMeters = distanceToTargetInMeters;
        this.angleToNormalInRadians = angleToNormalInRadians;
    }

    public double getDistanceToTargetInMeters() {
        return distanceToTargetInMeters;
    }

    public void setDistanceToTargetInMeters(double distanceToTargetInMeters) {
        this.distanceToTargetInMeters = distanceToTargetInMeters;
    }

    public double getAngleToNormalInRadians() {
        return angleToNormalInRadians;
    }

    public void setAngleToNormalInRadians(double angleToNormalInRadians) {
        this.angleToNormalInRadians = angleToNormalInRadians;
    }

    @Override
    public String toString() {
        return "PolarCoordinate{" +
                "distanceToTargetInMeters=" + distanceToTargetInMeters +
                ", angleToNormalInRadians=" + angleToNormalInRadians +
                '}';
    }
}
