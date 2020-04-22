package ua.lviv.iot.weapons.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.weapons.business.ArmService;
import ua.lviv.iot.weapons.model.Arm;

import java.util.List;

@RequestMapping ("/weapons")
@RestController
public class ArmController {
    @Autowired
    ArmService service;

    @GetMapping
    public List<Arm> getAllArms(){
        return service.getAllInstances();
    }

    @GetMapping (path = "/{id}")
    public Arm getArmById(@PathVariable("id") Integer id){
        return service.getInstanceById(id);
    }

    @PutMapping (path = "/{id}")
    public ResponseEntity<Arm> updateArm(@PathVariable("id") Integer updateId,
                                         @RequestBody Arm arm){
        arm.setWeaponID(updateId);
        HttpStatus status =  service.updateInstance(arm, updateId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).build();
    }

    @PostMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public Arm createArm(@RequestBody Arm arm){
        return service.addInstance(arm);
    }

    @DeleteMapping (path = "/{id}")
    public ResponseEntity<Arm> deleteArmById(@PathVariable("id") Integer id){
        HttpStatus status = service.deleteInstance(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).build();
    }
}
