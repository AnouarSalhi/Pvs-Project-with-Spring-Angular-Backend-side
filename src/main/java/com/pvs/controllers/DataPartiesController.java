package com.pvs.controllers;

import com.pvs.entities.DataParties;
import com.pvs.services.servicesImplementations.DataPartiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/dataparties")
@RestController
public class DataPartiesController {

    @Autowired
    private DataPartiesService dataPartiesService;

    // get all pv:
    @GetMapping(path = "/all")
    public List<DataParties> getPvs() {
        return dataPartiesService.getAll();
    }


    // add new pv
    @PostMapping(path = "/add")
    public void NewPv(@RequestBody DataParties dataPartie){
        dataPartiesService.add(dataPartie);
    }



    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        dataPartiesService.delete(id);
    }

}
