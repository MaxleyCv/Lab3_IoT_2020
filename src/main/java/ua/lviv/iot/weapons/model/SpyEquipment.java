package ua.lviv.iot.weapons.model;

public class SpyEquipment extends Arm {
    private double maximumDetectionDistanceInMeters;
    private Size sizeInCentimiters;

    public String getHeaders(){
        return (super.getHeaders() + "," + "maximumDetectionDistanceInMeters" + "," + "sizeInCentimiters");
    }

    public String toCSV(){
        return (super.toCSV() + "," + maximumDetectionDistanceInMeters + "," + sizeInCentimiters.toString());
    }


    public SpyEquipment(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double maximumDetectionDistanceInMeters, Size sizeInCentimiters) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage);
        this.maximumDetectionDistanceInMeters = maximumDetectionDistanceInMeters;
        this.sizeInCentimiters = sizeInCentimiters;
    }

    public double getMaximumDetectionDistanceInMeters() {
        return maximumDetectionDistanceInMeters;
    }

    public void setMaximumDetectionDistanceInMeters(double maximumDetectionDistanceInMeters) {
        this.maximumDetectionDistanceInMeters = maximumDetectionDistanceInMeters;
    }

    public Size getSizeInCentimiters() {
        return sizeInCentimiters;
    }

    public void setSizeInCentimiters(Size sizeInCentimiters) {
        this.sizeInCentimiters = sizeInCentimiters;
    }
}
