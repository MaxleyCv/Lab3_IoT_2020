package ua.lviv.iot.weapons.model;

public class Armour {
    public Armour(String material, ArmourCharachter armourCharacter, double thicknessInMillimeters) {
        this.material = material;
        this.armourCharacter = armourCharacter;
        this.thicknessInMillimeters = thicknessInMillimeters;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ArmourCharachter getArmourCharacter() {
        return armourCharacter;
    }

    public void setArmourCharacter(ArmourCharachter armourCharacter) {
        this.armourCharacter = armourCharacter;
    }

    public double getThicknessInMillimeters() {
        return thicknessInMillimeters;
    }

    public void setThicknessInMillimeters(double thicknessInMillimeters) {
        this.thicknessInMillimeters = thicknessInMillimeters;
    }


    private String material;
    private ArmourCharachter armourCharacter;
    private double thicknessInMillimeters;
}

