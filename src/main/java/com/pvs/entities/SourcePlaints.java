package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SourcePlaints {
    @Id
    @GeneratedValue
    private long id;
    private String nom;

    // RelationShips:

    @OneToMany(mappedBy = "sourcePlaints")
    private Collection<Plaints> plaints;
}
