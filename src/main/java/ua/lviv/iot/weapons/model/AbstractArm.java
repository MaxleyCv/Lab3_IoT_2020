package ua.lviv.iot.weapons.model;

public class AbstractArm {
    private String serialNumber;
    private String countryOfOrigin;
    private int countOnTheBase;
    private int numberOfPersonsInEquipage;
    private int garrisonCount;
    private int garrisonSallaryInDollars;
    private int weaponID;

    public AbstractArm(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage) {
        this.serialNumber = serialNumber;
        this.countryOfOrigin = countryOfOrigin;
        this.countOnTheBase = countOnTheBase;
        this.numberOfPersonsInEquipage = numberOfPersonsInEquipage;
        this.garrisonCount = numberOfPersonsInEquipage * countOnTheBase;
        this.garrisonSallaryInDollars = this.garrisonCount * 2000;
    }


    public String getHeaders(){
        return "serialNumber,countryOfOrigin,countOnTheBase,numberOfPersonsInEquipage,garrisonCount,garrisonSallaryInDollars";
    }

    public String toCSV(){
        return (this.serialNumber + "," + this.countryOfOrigin  + "," + this.countOnTheBase  + "," + this.numberOfPersonsInEquipage + "," + this.garrisonCount + "," + this.garrisonSallaryInDollars);
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

    public int getGarrisonCount() {
        return garrisonCount;
    }

    public int getGarrisonSallaryInDollars() {
        return garrisonSallaryInDollars;
    }

    public int getWeaponID() {
        return weaponID;
    }

    public void setWeaponID(int weaponID) {
        this.weaponID = weaponID;
    }
}