package com.pvs.controllers;

import com.pvs.entities.Pv;
import com.pvs.repositories.PvRepository;
import com.pvs.services.PvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pv")
@RestController
public class PvController {

    @Autowired
    private PvService pvService;

    // get all pv:
    @GetMapping(path = "/all")
    public List<Pv> getPvs() {
        return pvService.getPvs();
    }


    // add new pv
    @PostMapping(path = "/add")
    public void NewPv(@RequestBody Pv pv){
          pvService.addNewPv(pv);
    }



    @DeleteMapping("/deletePv/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        pvService.deletePv(id);
    }


}
