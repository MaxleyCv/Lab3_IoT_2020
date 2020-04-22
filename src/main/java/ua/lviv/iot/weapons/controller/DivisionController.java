package ua.lviv.iot.weapons.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.weapons.business.DivisionService;
import ua.lviv.iot.weapons.business.LagerService;
import ua.lviv.iot.weapons.model.Division;
import ua.lviv.iot.weapons.model.Lager;

import java.util.List;


@RestController
@RequestMapping(path = "/divisions")

public class DivisionController {
    @Autowired
    DivisionService service;

    @GetMapping
    public List<Division> getAllDivisions(){
        return service.getAllInstances();
    }

    @GetMapping (path = "/{id}")
    public Division getDivisionById(@PathVariable("id") Integer id){
        return service.getInstanceById(id);
    }

    @PutMapping (path = "/{id}")
    public ResponseEntity<Division> updateDivision(@PathVariable("id") Integer updateId,
                                             @RequestBody Division division){
        HttpStatus status =  service.updateInstance(division, updateId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).build();
    }

    @PostMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public Division createDivision(@RequestBody Division division){
        return service.addInstance(division);
    }

    @DeleteMapping (path = "/{id}")
    public ResponseEntity<Division> deleteLagerById(@PathVariable("id") Integer id){
        HttpStatus status = service.deleteInstance(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).build();
    }

}
