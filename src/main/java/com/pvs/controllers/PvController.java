package com.pvs.controllers;

import com.pvs.entities.Pv;
import com.pvs.services.ServicesInterfaces.PvServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/pv")
@RestController
public class PvController {

    @Autowired
    private PvServiceInterface pvService;

    // get all pv:
    @GetMapping(path = "/all")
    public List<Pv> getPvs() {
        return pvService.getAll();
    }


    // add new pv
    @PostMapping(path = "/add")
    public void NewPv(@RequestBody Pv pv){
          pvService.add(pv);
    }



    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        pvService.delete(id);
    }


}
