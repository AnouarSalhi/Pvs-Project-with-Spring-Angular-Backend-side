package com.pvs.controllers;

import com.pvs.entities.Pv;
import com.pvs.entities.PvsHasDataParties;
import com.pvs.services.PvService;
import com.pvs.services.PvsHasDataPartiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/dataparties")
@RestController
public class PvsHasDataPartiesController {

    @Autowired
    private PvsHasDataPartiesService dataPartiesService;

    // get all pv:
    @GetMapping(path = "/all")
    public List<PvsHasDataParties> getPvs() {
        return dataPartiesService.getAll();
    }


    // add new pv
    @PostMapping(path = "/add")
    public void NewPv(@RequestBody PvsHasDataParties pvsHasDataParties){
        dataPartiesService.add(pvsHasDataParties);
    }



    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        dataPartiesService.delete(id);
    }
}
