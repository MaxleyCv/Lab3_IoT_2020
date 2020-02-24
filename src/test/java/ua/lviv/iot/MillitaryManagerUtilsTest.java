package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.weapons.manager.MillitaryBaseManagerUtils;
import ua.lviv.iot.weapons.manager.SortingType;
import ua.lviv.iot.weapons.model.AbstractArm;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class MillitaryManagerUtilsTest extends BaseMillitaryManagerTest {

    @Test
    public void sortAllEquipmentByNumberOfPersonsInEquipageTest(){
        List<AbstractArm> result = MillitaryBaseManagerUtils.sortAllEquipmentByNumberOfPersonsInEquipage(weapons, SortingType.ASCEND);
        if(result.get(0).getNumberOfPersonsInEquipage() > result.get(result.size()-1).getNumberOfPersonsInEquipage()){
            fail("Not Sorted");
        }
    }

    @Test
    public void sortAllEquipmentByCountOnTheBaseTest(){
        List<AbstractArm> result = MillitaryBaseManagerUtils.sortAllEquipmentByNumberOfPersonsInEquipage(weapons, SortingType.ASCEND);
        if(result.get(0).getCountOnTheBase() > result.get(result.size() - 1).getCountOnTheBase()){
            fail("Not Sorted");
        }
    }

    @Test
    public void sortEquipmentByGarrisonCountTest(){
        List<AbstractArm> result = MillitaryBaseManagerUtils.sortEquipmentByGarrisonCount(weapons, SortingType.ASCEND);
        if(result.get(0).getGarrisonCount() > result.get(result.size() - 1).getGarrisonCount()){
            fail("Not Sorted");
        }
    }

    @Test
    public void sortEquipmentByMaintainCostTest(){
        List<AbstractArm> result = MillitaryBaseManagerUtils.sortEquipmentByMaintainCost(weapons, SortingType.ASCEND);
        if(result.get(0).getGarrisonSallaryInDollars() > result.get(result.size() - 1).getGarrisonSallaryInDollars()){
            fail("Not Sorted");
        }
    }
}
