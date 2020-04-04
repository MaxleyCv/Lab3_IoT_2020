package ua.lviv.iot.weapons.model;

public class Engine {
    private String model;
    private double gasCameraVolumeInLitres;
    private double fuelSpendPerWattInLitres;

    public Engine(String model, double gasCameraVolumeInLitres, double fuelSpendPerWattInLitres) {
        this.model = model;
        this.gasCameraVolumeInLitres = gasCameraVolumeInLitres;
        this.fuelSpendPerWattInLitres = fuelSpendPerWattInLitres;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getGasCameraVolumeInLitres() {
        return gasCameraVolumeInLitres;
    }

    public void setGasCameraVolumeInLitres(double gasCameraVolumeInLitres) {
        this.gasCameraVolumeInLitres = gasCameraVolumeInLitres;
    }

    public double getFuelSpendPerWattInLitres() {
        return fuelSpendPerWattInLitres;
    }

    public void setFuelSpendPerWattInLitres(double fuelSpendPerWattInLitres) {
        this.fuelSpendPerWattInLitres = fuelSpendPerWattInLitres;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", gasCameraVolumeInLitres=" + gasCameraVolumeInLitres +
                ", fuelSpendPerWattInLitres=" + fuelSpendPerWattInLitres +
                '}';
    }
}
