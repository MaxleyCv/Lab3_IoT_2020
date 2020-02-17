package ua.lviv.iot.weapons.manager;

import ua.lviv.iot.weapons.model.AbstractArm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class MillitaryBaseManagerUtils {
    public static List<AbstractArm> sortAllEquipmentByNumberOfPersonsInEquipage(List<AbstractArm> listOfEquipment, SortingType sortingType){
        int sequenceCoefficient;
        sequenceCoefficient = sortingType == SortingType.ASCEND ? 1 : -1;

        listOfEquipment.sort(new Comparator<AbstractArm>() {
            public int compare(AbstractArm arm1, AbstractArm arm2) {
                return sequenceCoefficient * (arm1.getNumberOfPersonsInEquipage() - arm2.getNumberOfPersonsInEquipage());
            }
        });

        return listOfEquipment;
    }

    public static List<AbstractArm> sortAllEquipmentByCountOnTheBase(List<AbstractArm> listOfEquipment, SortingType sortingType){

        int sequenceCoefficient;
        sequenceCoefficient = sortingType == SortingType.ASCEND ? 1 : -1;

        listOfEquipment.sort(new Comparator<AbstractArm>() {
            public int compare(AbstractArm arm1, AbstractArm arm2) {
                return sequenceCoefficient * (arm1.getCountOnTheBase() - arm2.getCountOnTheBase());
            }
        });

        return listOfEquipment;
    }
}
