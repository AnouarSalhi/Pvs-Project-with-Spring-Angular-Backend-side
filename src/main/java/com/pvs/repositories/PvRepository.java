package com.pvs.repositories;

import com.pvs.entities.Pv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PvRepository extends  JpaRepository<Pv,Long>{
}
