package ua.lviv.iot.weapons.business;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.weapons.dataaccess.LagerRepository;

import java.util.List;

public abstract class AbstractService<T> {
    protected abstract JpaRepository<T, Integer> getRepository();

    public T addInstance(T instance) {
        return getRepository().save(instance);
    }

    public List<T> getAllInstances(){
        return getRepository().findAll();
    }

    public T getInstanceById(Integer id){
        return getRepository().findById(id).orElse(null);
    }

    public boolean updateInstance(T newInstance, Integer id){
        if (getRepository().existsById(id)){
            getRepository().save(newInstance);
            return true;
        }
        else return false;
    }

    public boolean deleteInstance(Integer id){
        if(getRepository().findById(id).isPresent()){
            getRepository().deleteById(id);
            return true;
        }
        else return false;
    }
}
