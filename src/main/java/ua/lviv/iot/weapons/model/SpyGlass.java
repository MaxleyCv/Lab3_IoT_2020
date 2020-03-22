package ua.lviv.iot.weapons.model;

public class SpyGlass extends OpticalSpyEquipment{
    private double tubeDiameterInCentimeters;

    public SpyGlass(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double maximumDetectionDistanceInMeters, Size sizeInCentimiters, String glassType, double tubeDiameterInCentimeters) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, maximumDetectionDistanceInMeters, sizeInCentimiters, glassType);
        this.tubeDiameterInCentimeters = tubeDiameterInCentimeters;
    }

    public double getTubeDiameterInCentimeters() {
        return tubeDiameterInCentimeters;
    }

    public void setTubeDiameterInCentimeters(double tubeDiameterInCentimeters) {
        this.tubeDiameterInCentimeters = tubeDiameterInCentimeters;
    }

    public String getHeaders(){
        return (super.getHeaders() + "," + "tubeDiameterInCentimeters");
    }

    public String toCSV(){
        return (super.toCSV() + "," + tubeDiameterInCentimeters);
    }
}
