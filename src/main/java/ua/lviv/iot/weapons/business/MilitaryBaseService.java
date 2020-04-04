package ua.lviv.iot.weapons.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.weapons.dataaccess.MilitaryBaseRepository;
import ua.lviv.iot.weapons.model.AbstractArm;

import java.util.List;
import java.util.Optional;

@Service
public class MilitaryBaseService {
    @Autowired
    private MilitaryBaseRepository repository;

    public AbstractArm createArm(AbstractArm arm) {
        return repository.save(arm);
    }

    public List<AbstractArm> getAllArms(){
        return repository.findAll();
    }

    public AbstractArm getAnArm(Integer id){
        if (repository.findById(id).isPresent()) return repository.findById(id).get();
        else return null;
    }

    public void changeArm(AbstractArm arm, Integer id){
        repository.deleteById(arm.getWeaponID());
        System.out.println(arm.getWeaponID());
        arm.setWeaponID(id);
        repository.save(arm.setWeaponID(id));
    }

    public void deleteArm(Integer id){
        repository.deleteById(id);
    }
}
