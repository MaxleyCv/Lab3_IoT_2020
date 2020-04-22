package ua.lviv.iot.weapons.model;

public class Vehicle extends Arm {
    private Engine engine;
    private double maxFieldVelocityInKmh;
    private String model;
    private double fuelSpendPerFieldKmInLitres;
    private double maxAsphaltVelocityinKmh;
    private double fuelTankCapacityInLitres;

    public Vehicle(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, Engine engine, double maxFieldVelocityInKmh, String model, double fuelSpendPerFieldKmInLitres, double maxAsphaltVelocityinKmh, double fuelTankCapacityInLitres) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage);
        this.engine = engine;
        this.maxFieldVelocityInKmh = maxFieldVelocityInKmh;
        this.model = model;
        this.fuelSpendPerFieldKmInLitres = fuelSpendPerFieldKmInLitres;
        this.maxAsphaltVelocityinKmh = maxAsphaltVelocityinKmh;
        this.fuelTankCapacityInLitres = fuelTankCapacityInLitres;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getMaxFieldVelocityInKmh() {
        return maxFieldVelocityInKmh;
    }

    public void setMaxFieldVelocityInKmh(double maxFieldVelocityInKmh) {
        this.maxFieldVelocityInKmh = maxFieldVelocityInKmh;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelSpendPerFieldKmInLitres() {
        return fuelSpendPerFieldKmInLitres;
    }

    public void setFuelSpendPerFieldKmInLitres(double fuelSpendPerFieldKmInLitres) {
        this.fuelSpendPerFieldKmInLitres = fuelSpendPerFieldKmInLitres;
    }

    public double getMaxAsphaltVelocityinKmh() {
        return maxAsphaltVelocityinKmh;
    }

    public void setMaxAsphaltVelocityinKmh(double maxAsphaltVelocityinKmh) {
        this.maxAsphaltVelocityinKmh = maxAsphaltVelocityinKmh;
    }

    public double getFuelTankCapacityInLitres() {
        return fuelTankCapacityInLitres;
    }

    public void setFuelTankCapacityInLitres(double fuelTankCapacityInLitres) {
        this.fuelTankCapacityInLitres = fuelTankCapacityInLitres;
    }

    public void ride(){
        System.out.println("Wuuuuuuuuuuuuu!");
    }

    public String getHeaders(){
        return (super.getHeaders() + "," + "engine" + "," + "maxFieldVelocityInKmh" + "," + "fuelSpendPerFieldKmInLitres" + "," + "model" + "," + "maxAsphaltVelocityinKmh" + "," + "fuelTankCapacityInLitres");
    }

    public String toCSV(){
        return (super.toCSV() + "," + engine.toString() + "," + maxFieldVelocityInKmh + "," + fuelSpendPerFieldKmInLitres + "," + model + "," + maxAsphaltVelocityinKmh + "," + fuelTankCapacityInLitres);
    }
}
