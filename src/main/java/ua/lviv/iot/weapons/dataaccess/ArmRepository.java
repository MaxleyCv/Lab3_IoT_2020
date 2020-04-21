package ua.lviv.iot.weapons.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.weapons.model.AbstractArm;


@Repository
public interface ArmRepository extends JpaRepository<AbstractArm, Integer> {

}
