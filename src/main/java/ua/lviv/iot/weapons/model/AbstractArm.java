package ua.lviv.iot.weapons.model;

public class AbstractArm {
    private String serialNumber;
    private String countryOfOrigin;
    private int countOnTheBase;
    private int numberOfPersonsInEquipage;

    public AbstractArm(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage) {
        this.serialNumber = serialNumber;
        this.countryOfOrigin = countryOfOrigin;
        this.countOnTheBase = countOnTheBase;
        this.numberOfPersonsInEquipage = numberOfPersonsInEquipage;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getCountOnTheBase() {
        return countOnTheBase;
    }

    public void setCountOnTheBase(int countOnTheBase) {
        this.countOnTheBase = countOnTheBase;
    }

    public int getNumberOfPersonsInEquipage() {
        return numberOfPersonsInEquipage;
    }

    public void setNumberOfPersonsInEquipage(int numberOfPersonsInEquipage) {
        this.numberOfPersonsInEquipage = numberOfPersonsInEquipage;
    }
}