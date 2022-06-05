package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TypePoliceJudic {
    @Id
    private long id;
    private String nom;

    @OneToMany(mappedBy = "typePoliceJudic")
    private Collection<Pv> pvs;

    @OneToMany(mappedBy = "typePoliceJudic")
    private Collection<PvsReponses> pvsReponses;

}
