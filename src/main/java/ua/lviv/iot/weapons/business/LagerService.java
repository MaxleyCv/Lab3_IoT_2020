package ua.lviv.iot.weapons.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.weapons.dataaccess.LagerRepository;
import ua.lviv.iot.weapons.model.Lager;

@Service
public class LagerService extends AbstractService<Lager>{
    @Autowired
    private LagerRepository lagerRepository;

    @Override
    protected LagerRepository getRepository() {
        return lagerRepository;
    }
}
