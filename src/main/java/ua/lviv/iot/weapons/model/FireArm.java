package ua.lviv.iot.weapons.model;

public class FireArm extends Arm {
    private double calibre;
    private int maxCartridgeCapacity;
    private double minimumVolleyTimeInSeconds;
    private double massInKg;
    private double reloadingTimeInSeconds;

    public FireArm(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, double calibre, int maxCartridgeCapacity, double minimumVolleyTimeInSeconds, double massInKg, double reloadingTimeInSeconds) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage);
        this.calibre = calibre;
        this.maxCartridgeCapacity = maxCartridgeCapacity;
        this.minimumVolleyTimeInSeconds = minimumVolleyTimeInSeconds;
        this.massInKg = massInKg;
        this.reloadingTimeInSeconds = reloadingTimeInSeconds;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public int getMaxCartridgeCapacity() {
        return maxCartridgeCapacity;
    }

    public void setMaxCartridgeCapacity(int maxCartridgeCapacity) {
        this.maxCartridgeCapacity = maxCartridgeCapacity;
    }

    public double getMinimumVolleyTimeInSeconds() {
        return minimumVolleyTimeInSeconds;
    }

    public void setMinimumVolleyTimeInSeconds(double minimumVolleyTimeInSeconds) {
        this.minimumVolleyTimeInSeconds = minimumVolleyTimeInSeconds;
    }

    public double getMassInKg() {
        return massInKg;
    }

    public void setMassInKg(double massInKg) {
        this.massInKg = massInKg;
    }

    public double getReloadingTimeInSeconds() {
        return reloadingTimeInSeconds;
    }

    public void setReloadingTimeInSeconds(double reloadingTimeInSeconds) {
        this.reloadingTimeInSeconds = reloadingTimeInSeconds;
    }

    public void shoot(){
        System.out.println("BABAX");
    }

    public String getHeaders(){
        return (super.getHeaders() + "," + "calibre" + "," + "maxCartridgeCapacity" + "," + "minimumVolleyTimeInSeconds" + "," + "massInKg" + "," + "reloadingTimeInSeconds");
    }

    public String toCSV(){
        return (super.toCSV() + "," + calibre + "," + maxCartridgeCapacity + "," + minimumVolleyTimeInSeconds + "," + massInKg + "," + reloadingTimeInSeconds);
    }
}
