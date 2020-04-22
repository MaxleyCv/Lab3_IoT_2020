package ua.lviv.iot.weapons.manager;

import ua.lviv.iot.weapons.model.Arm;
import ua.lviv.iot.weapons.model.SpyEquipment;

import java.util.LinkedList;
import java.util.List;

public class MilitaryBaseManager {
    private List<Arm> listOfAllEquipment;

    public MilitaryBaseManager(List<Arm> listOfAllEquipment) {
        this.listOfAllEquipment = listOfAllEquipment;
    }

    public List<Arm> findSpyEquipmentByDetectionRange(double detectionDistance){
        List<Arm> resultingList = new LinkedList<Arm>();
        for (Arm arm : this.listOfAllEquipment){
            if (arm instanceof SpyEquipment && ((SpyEquipment) arm).getMaximumDetectionDistanceInMeters() > detectionDistance){
                resultingList.add(arm);
            }
        }
        return resultingList;
    }

}
