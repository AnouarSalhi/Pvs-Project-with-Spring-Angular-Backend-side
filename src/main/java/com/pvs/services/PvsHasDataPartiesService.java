package com.pvs.services;

import com.pvs.entities.DataParties;
import com.pvs.entities.PvsHasDataParties;
import com.pvs.repositories.DataPartiesRepository;
import com.pvs.repositories.PvsHasDataPartiesRepository;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
@Data
@Getter
@Setter
@Service
public class PvsHasDataPartiesService {

    @Autowired
    private PvsHasDataPartiesRepository pvsHasDataPartiesRepository;

    // get all pvs:
    public List<PvsHasDataParties> getAll(){
        return pvsHasDataPartiesRepository.findAll();
    }

    // get a specific Pv by it Id:
    public Optional<PvsHasDataParties> retrieveStudent(@PathVariable(name = "id") Long id){
        return pvsHasDataPartiesRepository.findById(id);
    }

    // Add new Pv:
    public PvsHasDataParties add(PvsHasDataParties pvsHasDataParties){
        return pvsHasDataPartiesRepository.save(pvsHasDataParties);

    }

    // update an existing pv using its Id:
    public PvsHasDataParties update(@PathVariable(name = "id") Long id,@RequestBody PvsHasDataParties pvsHasDataParties){
        pvsHasDataParties.setId(id);
        return pvsHasDataPartiesRepository.save(pvsHasDataParties);
    }

    // Delete Pv :
    public void delete(Long id){
        pvsHasDataPartiesRepository.deleteById(id);
    }
}
