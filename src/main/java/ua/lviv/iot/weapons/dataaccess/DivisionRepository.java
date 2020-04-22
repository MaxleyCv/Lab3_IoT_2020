package ua.lviv.iot.weapons.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.weapons.model.Division;


@Repository
public interface DivisionRepository extends JpaRepository<Division, Integer> {

}
