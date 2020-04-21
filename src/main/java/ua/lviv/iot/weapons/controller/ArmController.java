package ua.lviv.iot.weapons.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.weapons.business.ArmService;
import ua.lviv.iot.weapons.model.AbstractArm;

import java.util.List;

@RequestMapping ("/weapons")
@RestController
public class ArmController {
    @Autowired
    ArmService service;

    @GetMapping
    public List<AbstractArm> getAllArms(){
        return service.getAllInstances();
    }

    @GetMapping (path = "/{id}")
    public AbstractArm getArmById(@PathVariable("id") Integer id){
        return service.getInstanceById(id);
    }

    @PutMapping (path = "/{id}")
    public ResponseEntity<AbstractArm> updateArm(@PathVariable("id") Integer updateId,
                                             @RequestBody AbstractArm arm){
        HttpStatus status =  service.updateInstance(arm, updateId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).build();
    }

    @PostMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public AbstractArm createArm(@RequestBody AbstractArm arm){
        return service.addInstance(arm);
    }

    @DeleteMapping (path = "/{id}")
    public ResponseEntity<AbstractArm> deleteArmById(@PathVariable("id") Integer id){
        HttpStatus status = service.deleteInstance(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).build();
    }
}
