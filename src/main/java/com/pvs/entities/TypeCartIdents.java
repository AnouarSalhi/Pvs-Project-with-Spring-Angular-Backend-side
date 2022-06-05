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
public class TypeCartIdents {
    @Id
    @GeneratedValue
    private long id;
    private String nom;

    // Relationships:

    @OneToMany(mappedBy = "typeCartIdents")
    private Collection<DataParties> dataParties;
}
