package ua.lviv.iot.weapons.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.weapons.model.AbstractArm;

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


    @GetMapping
    public List<AbstractArm> getMilitaryList(){
        return new LinkedList<>(listOfWeapons.values());
    }

    @PostMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public AbstractArm generateWeapon(@RequestBody AbstractArm arm){
        arm.setWeaponID(generateKey());
        listOfWeapons.put(arm.getWeaponID(), arm);
        return arm;
    }

    @DeleteMapping (path = "/{id}")
    public ResponseEntity<AbstractArm> deleteArmByID(@PathVariable Integer id){
        HttpStatus status = (listOfWeapons.remove(id) == null) ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @GetMapping (path = "/{id}")
    public AbstractArm getArmByID(@PathVariable Integer id){
        return listOfWeapons.get(id);
    }

    @PutMapping (path = "/{id}")
    public ResponseEntity<AbstractArm> updateArm(final @PathVariable Integer id, final @RequestBody AbstractArm arm){
        HttpStatus status = (listOfWeapons.get(id) == null) ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        arm.setWeaponID(id);
        if (status.equals(HttpStatus.OK)){
            listOfWeapons.put(id, arm);
        }
        return ResponseEntity.status(status).build();
    }

}
