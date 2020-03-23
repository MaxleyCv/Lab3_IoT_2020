package ua.lviv.iot.weapons.model;

public class OpticalSpyEquipment extends SpyEquipment {
    private String glassType;

    public OpticalSpyEquipment(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double maximumDetectionDistanceInMeters, Size sizeInCentimiters, String glassType) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, maximumDetectionDistanceInMeters, sizeInCentimiters);
        this.glassType = glassType;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    public void scale(double scaleSwitchPositionInPercent){
        System.out.println("Scaling in " + scaleSwitchPositionInPercent + " times");
    }

    public String getHeaders(){
        return (super.getHeaders() + "," + "glassType");
    }

    public String toCSV(){
        return (super.toCSV() + "," + glassType);
    }
}
