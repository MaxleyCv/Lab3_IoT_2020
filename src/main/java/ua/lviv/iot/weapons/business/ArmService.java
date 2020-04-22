package ua.lviv.iot.weapons.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.weapons.dataaccess.ArmRepository;
import ua.lviv.iot.weapons.model.Arm;

@Service
public class ArmService extends AbstractService<Arm> {
    @Autowired
    private ArmRepository repository;

    @Override
    protected ArmRepository getRepository() {
        return repository;
    }
}
