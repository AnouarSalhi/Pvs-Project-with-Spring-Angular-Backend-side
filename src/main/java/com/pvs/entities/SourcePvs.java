package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SourcePvs implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(length=255)
    private String nom;

    @OneToMany(mappedBy = "sourcePvs",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Collection<Pv> pvs;

}
