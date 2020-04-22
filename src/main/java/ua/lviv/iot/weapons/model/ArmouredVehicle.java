package ua.lviv.iot.weapons.model;

public class ArmouredVehicle extends Vehicle {
    private Armour armour;


    public ArmouredVehicle(String serialNumber, String countryOfOrigin, int countOnTheBase, int numberOfPersonsInEquipage, Engine engine, double maxFieldVelocityInKmh, String model, double fuelSpendPerFieldKmInLitres, double maxAsphaltVelocityinKmh, double fuelTankCapacityInLitres, Armour armour) {
        super(serialNumber, countryOfOrigin, countOnTheBase, numberOfPersonsInEquipage, engine, maxFieldVelocityInKmh, model, fuelSpendPerFieldKmInLitres, maxAsphaltVelocityinKmh, fuelTankCapacityInLitres);
        this.armour = armour;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public void destroyBullet(){
        //SomeLogicGoesHere
        if (this.armour.getThicknessInMillimeters() > 5 || this.armour.getArmourCharacter() == ArmourCharachter.DYNAMIC){
            System.out.println("Machine is in Safety");
        }
        else {
            System.out.println("Vehicle destroyed");
        }
    }

    public String getHeaders(){
        return super.getHeaders();
    }

    public String toCSV(){
        return super.toCSV();
    }
}
