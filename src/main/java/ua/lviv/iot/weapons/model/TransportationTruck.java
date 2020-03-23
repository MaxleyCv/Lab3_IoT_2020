package ua.lviv.iot.weapons.model;

public class TransportationTruck extends Vehicle {
    private int capacityInSeats;

    public TransportationTruck(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, Engine engine, double maxFieldVelocityInKmh, String model, double fuelSpendPerFieldKmInLitres, double maxAsphaltVelocityinKmh, double fuelTankCapacityInLitres, int capacityInSeats) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, engine, maxFieldVelocityInKmh, model, fuelSpendPerFieldKmInLitres, maxAsphaltVelocityinKmh, fuelTankCapacityInLitres);
        this.capacityInSeats = capacityInSeats;
    }


    public int getCapacityInSeats() {
        return capacityInSeats;
    }

    public void setCapacityInSeats(int capacityInSeats) {
        this.capacityInSeats = capacityInSeats;
    }

    public String getHeaders(){
        return super.getHeaders();
    }

    public String toCSV(){
        return super.toCSV();
    }
}
