package ua.lviv.iot.weapons.manager;

import ua.lviv.iot.weapons.model.AbstractArm;
import ua.lviv.iot.weapons.model.SpyEquipment;

import java.util.LinkedList;
import java.util.List;

public class MilitaryBaseManager {
    private List<AbstractArm> listOfAllEquipment;

    public MilitaryBaseManager(List<AbstractArm> listOfAllEquipment) {
        this.listOfAllEquipment = listOfAllEquipment;
    }

    public List<AbstractArm> findSpyEquipmentByDetectionRange(double detectionDistance){
        List<AbstractArm> resultingList = new LinkedList<AbstractArm>();
        for (AbstractArm arm : this.listOfAllEquipment){
            if (arm instanceof SpyEquipment && ((SpyEquipment) arm).getMaximumDetectionDistanceInMeters() > detectionDistance){
                resultingList.add(arm);
            }
        }
        return resultingList;
    }

}
