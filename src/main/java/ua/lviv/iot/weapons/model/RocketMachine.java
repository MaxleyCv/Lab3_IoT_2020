package ua.lviv.iot.weapons.model;

public class RocketMachine extends ArmouredVehicle {
    private MLRS mlrs;
    private double setupTimeInSeconds;

    public RocketMachine(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, Engine engine, double maxFieldVelocityInKmh, String model, double fuelSpendPerFieldKmInLitres, double maxAsphaltVelocityinKmh, double fuelTankCapacityInLitres, Armour armour, MLRS mlrs, double setupTimeInSeconds) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, engine, maxFieldVelocityInKmh, model, fuelSpendPerFieldKmInLitres, maxAsphaltVelocityinKmh, fuelTankCapacityInLitres, armour);
        this.mlrs = mlrs;
        this.setupTimeInSeconds = setupTimeInSeconds;
    }


    public MLRS getMlrs() {
        return mlrs;
    }

    public void setMlrs(MLRS mlrs) {
        this.mlrs = mlrs;
    }

    public double getSetupTimeInSeconds() {
        return setupTimeInSeconds;
    }

    public void setSetupTimeInSeconds(double setupTimeInSeconds) {
        this.setupTimeInSeconds = setupTimeInSeconds;
    }

    public String getHeaders(){
        return super.getHeaders();
    }

    public String toCSV(){
        return super.toCSV();
    }
}
