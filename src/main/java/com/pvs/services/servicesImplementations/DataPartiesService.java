package com.pvs.services.servicesImplementations;

import com.pvs.entities.DataParties;
import com.pvs.repositories.DataPartiesRepository;
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
public class DataPartiesService {

    @Autowired
    private DataPartiesRepository dataPartiesRepository;

    // get all pvs:
    public List<DataParties> getAll(){
        return dataPartiesRepository.findAll();
    }

    // get a specific Pv by it Id:
    public Optional<DataParties> retrieveStudent(@PathVariable(name = "id") Long id){
        return dataPartiesRepository.findById(id);
    }

    // Add new Pv:
    public DataParties add(DataParties dataPartie){
        return dataPartiesRepository.save(dataPartie);

    }

    // update an existing pv using its Id:
    public DataParties update(@PathVariable(name = "id") Long id,@RequestBody DataParties dataPartie){
        dataPartie.setId(id);
        return dataPartiesRepository.save(dataPartie);
    }

    // Delete Pv :
    public void delete(Long id){
        dataPartiesRepository.deleteById(id);
    }
}
