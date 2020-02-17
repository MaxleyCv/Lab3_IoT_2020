package ua.lviv.iot.weapons.model;

import java.util.LinkedList;
import java.util.List;

public class AirRadar extends ElectronicSpyEquipment {
    private double wavelengthInMillimeter;

    public AirRadar(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double maximumDetectionDistanceInMeters, Size sizeInCentimiters, double batteryCapacityInHours, double screenDiagonalInInches, double wavelengthInMillimeter) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, maximumDetectionDistanceInMeters, sizeInCentimiters, batteryCapacityInHours, screenDiagonalInInches);
        this.wavelengthInMillimeter = wavelengthInMillimeter;
    }

    public double getWavelengthInMillimeter() {
        return wavelengthInMillimeter;
    }

    public void setWavelengthInMillimeter(double wavelengthInMillimeter) {
        this.wavelengthInMillimeter = wavelengthInMillimeter;
    }

    public List<PolarCoordinate> returnListOfSurroundingPlanes(){
        return new LinkedList<PolarCoordinate>();
    }
}
