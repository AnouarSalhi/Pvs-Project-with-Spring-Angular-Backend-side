package com.pvs.services.ServicesInterfaces;

import com.pvs.entities.DataParties;
import com.pvs.repositories.DataPartiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface DataPartiesServiceInterface{

    public List<DataParties> getAll();

    // get a specific Pv by it Id:
    public Optional<DataParties> retrieveStudent(@PathVariable(name = "id") Long id);

    // Add new Pv:
    public DataParties add(DataParties dataPartie);

    // update an existing pv using its Id:
    public DataParties update(@PathVariable(name = "id") Long id,@RequestBody DataParties dataPartie);
    // Delete Pv :
    public void delete(Long id);
}
