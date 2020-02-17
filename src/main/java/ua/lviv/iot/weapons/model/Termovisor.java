package ua.lviv.iot.weapons.model;

import java.util.LinkedList;
import java.util.List;

public class Termovisor extends ElectronicSpyEquipment {
    private double minTemperatureInDegreesCelcius;
    private double maxTemperatureInDegreesCelcius;

    public Termovisor(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double maximumDetectionDistanceInMeters, Size sizeInCentimiters, double batteryCapacityInHours, double screenDiagonalInInches, double minTemperatureInDegreesCelcius, double maxTemperatureInDegreesCelcius) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, maximumDetectionDistanceInMeters, sizeInCentimiters, batteryCapacityInHours, screenDiagonalInInches);
        this.minTemperatureInDegreesCelcius = minTemperatureInDegreesCelcius;
        this.maxTemperatureInDegreesCelcius = maxTemperatureInDegreesCelcius;
    }

    public double getMinTemperatureInDegreesCelcius() {
        return minTemperatureInDegreesCelcius;
    }

    public void setMinTemperatureInDegreesCelcius(double minTemperatureInDegreesCelcius) {
        this.minTemperatureInDegreesCelcius = minTemperatureInDegreesCelcius;
    }

    public double getMaxTemperatureInDegreesCelcius() {
        return maxTemperatureInDegreesCelcius;
    }

    public void setMaxTemperatureInDegreesCelcius(double maxTemperatureInDegreesCelcius) {
        this.maxTemperatureInDegreesCelcius = maxTemperatureInDegreesCelcius;
    }

    public List<PolarCoordinate> getSurroundingWarmObjects(){
        return new LinkedList<PolarCoordinate>();
    }
}
