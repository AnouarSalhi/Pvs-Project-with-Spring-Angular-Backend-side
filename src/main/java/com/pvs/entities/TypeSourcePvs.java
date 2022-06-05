package com.pvs.entities;

import javax.persistence.*;
import java.util.Collection;

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
