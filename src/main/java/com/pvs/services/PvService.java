package com.pvs.services;

import com.pvs.entities.Pv;
import com.pvs.repositories.PvRepository;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Data
@Getter
@Setter
@Service
public class PvService {

    @Autowired
    private PvRepository pvRepository;

    // get all pvs:
    public List<Pv> getPvs(){
        return pvRepository.findAll();
    }

    // get a specific Pv by it Id:
    public Optional<Pv> retrieveStudent(@PathVariable(name = "id") Long id){
        return pvRepository.findById(id);
    }

    // Add new Pv:
    public Pv addNewPv(Pv pv){
        return pvRepository.save(pv);

    }

   // update an existing pv using its Id:
    public Pv updatePv(@PathVariable(name = "id") Long id,@RequestBody Pv pv){
        pv.setId(id);
        return pvRepository.save(pv);
    }

    // Delete Pv :
    public void deletePv(Long id){
        pvRepository.deleteById(id);
    }
}
