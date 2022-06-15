package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TypePlaints implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(length = 45)
    private String nom;

    // RelationShips:

    @OneToMany(mappedBy = "typePlaints")
    private Collection<Plaints> plaints;
}
