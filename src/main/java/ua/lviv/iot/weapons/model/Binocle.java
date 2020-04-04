package ua.lviv.iot.weapons.model;

public class Binocle extends OpticalSpyEquipment {
    private int lensNumber;

    public Binocle(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double maximumDetectionDistanceInMeters, Size sizeInCentimiters, String glassType, int lensNumber) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, maximumDetectionDistanceInMeters, sizeInCentimiters, glassType);
        this.lensNumber = lensNumber;
    }

    public int getLensNumber() {
        return lensNumber;
    }

    public void setLensNumber(int lensNumber) {
        this.lensNumber = lensNumber;
    }

    public String getHeaders(){
        return (super.getHeaders() + "," + "lensNumber");
    }

    public String toCSV(){
        return (super.toCSV() + "," + lensNumber);
    }
}


