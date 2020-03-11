package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.weapons.manager.MilitaryBaseManager;
import ua.lviv.iot.weapons.model.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class BaseMillitaryManagerTest {
    protected List<AbstractArm> weapons;

    @BeforeEach
    void setUp(){
        this.weapons = new LinkedList<AbstractArm>();
        this.weapons.add(new TransportationTruck("CE2143ER", "Deutschland", 1000, 2, new Engine("Volvo U1", 2.5, 1), 25, "Einigkeit", 0.1, 120, 3, 50));
        this.weapons.add(new Tank("UU2254CE", "Ukraine", 25, 5, new Engine("Volvo V5", 5.4, 2), 25.4, "Tarpan", 10, 47, 500,new Armour("composite", ArmourCharachter.STATIC, 5),  new Gun("U1232", "Belarus", 25, 3, 25, 5, 5, 500, 34, 0.1, 2.5), 2));
        this.weapons.add(new Binocle("HU2323", "Germany", 2, 1, 34, new Size(2, 2, 2), "stainless", 2));
        this.weapons.add(new AirRadar("PU43523IO", "Moldova", 32, 1, 1000, new Size(10, 10, 5), 34, 5, 0.01));
    }

}
