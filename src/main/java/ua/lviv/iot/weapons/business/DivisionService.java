package ua.lviv.iot.weapons.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ua.lviv.iot.weapons.dataaccess.DivisionRepository;
import ua.lviv.iot.weapons.dataaccess.LagerRepository;
import ua.lviv.iot.weapons.model.Division;

@Service
public class DivisionService extends AbstractService<Division> {
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    protected DivisionRepository getRepository() {
        return divisionRepository;
    }
}
