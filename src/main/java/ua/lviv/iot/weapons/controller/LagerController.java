package ua.lviv.iot.weapons.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.weapons.business.AbstractService;
import ua.lviv.iot.weapons.business.LagerService;
import ua.lviv.iot.weapons.model.Lager;

import java.util.List;


@RestController
@RequestMapping(path = "/lagers")

public class LagerController {
    @Autowired
    LagerService service;

    @GetMapping
    public List<Lager> getAllLagers(){
        return service.getAllInstances();
    }

    @GetMapping (path = "/{id}")
    public Lager getLagerById(@PathVariable("id") Integer id){
        return service.getInstanceById(id);
    }

    @PutMapping (path = "/{id}")
    public ResponseEntity<Lager> updateLager(@PathVariable("id") Integer updateId,
                                             @RequestBody Lager lager){
        HttpStatus status =  service.updateInstance(lager, updateId) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).build();
    }

    @PostMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public Lager createLager(@RequestBody Lager lager){
        return service.addInstance(lager);
    }

    @DeleteMapping (path = "/{id}")
    public ResponseEntity<Lager> deleteLagerById(@PathVariable("id") Integer id){
        HttpStatus status = service.deleteInstance(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).build();
    }

}
