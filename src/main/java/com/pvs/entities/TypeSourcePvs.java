package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TypeSourcePvs {
    @Id
    @GeneratedValue
    private long id;
    private String nom;

    @OneToMany(mappedBy = "typeSourcePvs")
    private Collection<Pv> pvs;

    @OneToMany(mappedBy = "typeSourcePvs")
    private Collection<PvsReponses> pvsReponses;



}
