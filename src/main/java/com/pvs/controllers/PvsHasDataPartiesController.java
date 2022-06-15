package com.pvs.controllers;

import com.pvs.entities.PvsHasDataParties;
import com.pvs.services.servicesImplementations.PvsHasDataPartiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/pvshasdataparties")
@RestController
public class PvsHasDataPartiesController {

    @Autowired
    private PvsHasDataPartiesService pvsHasDataPartiesService;

    // get all :
    @GetMapping(path = "/all")
    public List<PvsHasDataParties> getPvs() {
        return pvsHasDataPartiesService.getAll();
    }


    // add new
    @PostMapping(path = "/add")
    public void New(@RequestBody PvsHasDataParties pvsHasDataParties){
        pvsHasDataPartiesService.add(pvsHasDataParties);
    }



    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        pvsHasDataPartiesService.delete(id);
    }
}
