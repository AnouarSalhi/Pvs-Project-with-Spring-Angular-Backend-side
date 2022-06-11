package com.pvs.repositories;

import com.pvs.entities.Pv;
import com.pvs.entities.PvsHasDataParties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PvsHasDataPartiesRepository extends JpaRepository<PvsHasDataParties,Long> {
}
