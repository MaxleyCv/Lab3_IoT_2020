package ua.lviv.iot.weapons.manager;

import ua.lviv.iot.weapons.model.Arm;

import java.util.Comparator;
import java.util.List;

public class MillitaryBaseManagerUtils {
    //Utilities for non-static inner class
    private static MillitaryBaseManagerUtils UTILS = new MillitaryBaseManagerUtils();
    private static final  MillitaryBaseManagerUtils.EquipmentSorterByCount EQUIPMENT_SORTER_BY_COUNT = UTILS.new EquipmentSorterByCount();
    //Utilities for static inner class
    private static final EquipmentSorterByEquipage EQUIPMENT_SORTER_BY_EQUIPAGE = new EquipmentSorterByEquipage();

    /**
     * SORTING WITH STATIC INNER CLASS
     * @param listOfEquipment
     * @param sortingType
     * @return
     */
    public static List<Arm> sortAllEquipmentByNumberOfPersonsInEquipage(List<Arm> listOfEquipment, SortingType sortingType){
        listOfEquipment.sort(sortingType == SortingType.ASCEND ? EQUIPMENT_SORTER_BY_EQUIPAGE : EQUIPMENT_SORTER_BY_EQUIPAGE.reversed());
        return listOfEquipment;
    }

    /**
     * SORTING WITH INNER CLASS
     * @param listOfEquipment
     * @param sortingType
     * @return
     */

    public static List<Arm> sortAllEquipmentByCountOnTheBase(List<Arm> listOfEquipment, SortingType sortingType){
        listOfEquipment.sort(sortingType == SortingType.ASCEND ? EQUIPMENT_SORTER_BY_COUNT : EQUIPMENT_SORTER_BY_COUNT.reversed());
        return listOfEquipment;
    }

    /**
     * SORTING WITH AN ANONYMOUS INNER CLASS
     * @param listOfEquipment
     * @param sortingType
     * @return
     */
    public static List<Arm> sortEquipmentByGarrisonCount(List<Arm> listOfEquipment, SortingType sortingType){

        int sequenceCoefficient;
        sequenceCoefficient = sortingType == SortingType.ASCEND ? 1 : -1;

        listOfEquipment.sort(new Comparator<Arm>() {
            public int compare(Arm arm1, Arm arm2) {
                return sequenceCoefficient * (arm1.getGarrisonCount() - arm2.getGarrisonCount());
            }
        });

        return listOfEquipment;
    }

    /**
     * SORTING WITH LAMBDA
     * @param listOfEquipment
     * @param sortingType
     * @return
     */

    public static List<Arm> sortEquipmentByMaintainCost(List<Arm> listOfEquipment, SortingType sortingType){

        int sequenceCoefficient;
        sequenceCoefficient = sortingType == SortingType.ASCEND ? 1 : -1;

        listOfEquipment.sort((arm1, arm2) -> {
            return sequenceCoefficient * (arm1.getGarrisonSallaryInDollars() - arm2.getGarrisonSallaryInDollars());
        });

        return listOfEquipment;
    }

    private class EquipmentSorterByCount implements Comparator<Arm>{

        @Override
        public int compare(Arm arm1, Arm arm2) {
            return arm1.getCountOnTheBase() - arm2.getCountOnTheBase();
        }
    }

    private static class EquipmentSorterByEquipage implements Comparator<Arm>{

        @Override
        public int compare(Arm arm1, Arm arm2){
            return arm1.getNumberOfPersonsInEquipage() - arm2.getNumberOfPersonsInEquipage();
        }
    }
}
