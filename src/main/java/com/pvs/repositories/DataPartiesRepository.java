package com.pvs.repositories;

import com.pvs.entities.DataParties;
import com.pvs.entities.Pv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataPartiesRepository extends JpaRepository<DataParties,Long> {
}
