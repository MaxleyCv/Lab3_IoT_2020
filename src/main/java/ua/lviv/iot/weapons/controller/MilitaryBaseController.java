package ua.lviv.iot.weapons.controller;


import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.weapons.business.MilitaryBaseService;
import ua.lviv.iot.weapons.model.AbstractArm;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping ("/weapons")
@RestController
public class MilitaryBaseController {

    private int generateKey(){
        return equipmentCount.incrementAndGet();
    }
    private Map<Integer, AbstractArm> listOfWeapons = new HashMap<>();
    private AtomicInteger equipmentCount = new AtomicInteger();

    @Autowired
    private MilitaryBaseService service;


    @GetMapping
    public List<AbstractArm> getMilitaryList(){
        return service.getAllArms();
    }

    @PostMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public AbstractArm generateWeapon(@RequestBody AbstractArm arm){
        return service.createArm(arm);
    }

    @DeleteMapping (path = "/{id}")
    public ResponseEntity<AbstractArm> deleteArmByID(@PathVariable Integer id){
        HttpStatus status = (service.getAnArm(id) == null) ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        if (status.equals(HttpStatus.OK)) service.deleteArm(id);
        return ResponseEntity.status(status).build();
    }

    @GetMapping (path = "/{id}")
    public AbstractArm getArmByID(@PathVariable Integer id){
        AbstractArm gotArm;
        gotArm = (AbstractArm) service.getAnArm(id);
        return gotArm;
    }

    @PutMapping (path = "/{id}")
    public ResponseEntity<AbstractArm> updateArm(final @PathVariable Integer id, final @RequestBody AbstractArm arm){
        HttpStatus status = (service.getAnArm(id) == null) ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        arm.setWeaponID(id);
        if (status.equals(HttpStatus.OK)){
            service.changeArm(arm, id);
        }
        return ResponseEntity.status(status).build();
    }

}
