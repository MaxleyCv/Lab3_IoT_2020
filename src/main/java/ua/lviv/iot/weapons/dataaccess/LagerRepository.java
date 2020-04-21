package ua.lviv.iot.weapons.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.weapons.model.AbstractArm;
import ua.lviv.iot.weapons.model.Lager;


@Repository
public interface LagerRepository extends JpaRepository<Lager, Integer> {

}
