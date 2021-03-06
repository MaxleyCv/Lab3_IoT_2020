package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.weapons.manager.MilitaryBaseManager;
import ua.lviv.iot.weapons.model.AbstractArm;
import ua.lviv.iot.weapons.model.SpyEquipment;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;


public class MillitaryManagerTest extends BaseMillitaryManagerTest {

    @Test
    public void findEquipmentByRangeTest(){
        MilitaryBaseManager manager = new MilitaryBaseManager(weapons);
        double testDetectionDistance = 20;
        List<AbstractArm> result = manager.findSpyEquipmentByDetectionRange(testDetectionDistance);
        for (AbstractArm arm : result){
            System.out.println(arm.getCountryOfOrigin());
            if (((SpyEquipment)arm).getMaximumDetectionDistanceInMeters() < testDetectionDistance){
                fail("the detection distance is wrong");
            }
        }
    }
}
