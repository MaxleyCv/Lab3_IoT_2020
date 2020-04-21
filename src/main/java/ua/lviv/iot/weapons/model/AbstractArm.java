package ua.lviv.iot.weapons.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AbstractArm {
    private String serialNumber;
    private String countryOfOrigin;
    private int countOnTheBase;
    private int numberOfPersonsInEquipage;
    private int garrisonCount;
    private int garrisonSallaryInDollars;

    @ManyToMany(mappedBy = "usedArms")
    private Set<Division> divisions;

    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "lager_id")
    @JsonIgnoreProperties("arms")
    private Lager lager;

    public Set<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(Set<Division> divisions) {
        this.divisions = divisions;
    }

    public Lager getLager() {
        return lager;
    }

    public void setLager(Lager lager) {
        this.lager = lager;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int weaponID;

    public AbstractArm(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage) {
        this.serialNumber = serialNumber;
        this.countryOfOrigin = countryOfOrigin;
        this.countOnTheBase = countOnTheBase;
        this.numberOfPersonsInEquipage = numberOfPersonsInEquipage;
        this.garrisonCount = numberOfPersonsInEquipage * countOnTheBase;
        this.garrisonSallaryInDollars = this.garrisonCount * 2000;
    }

    public AbstractArm() {
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

    public AbstractArm setWeaponID(int weaponID) {
        this.weaponID = weaponID;
        return this;
    }
}