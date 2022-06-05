package com.pvs.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Nationalites {
    @Id
    private long id;
    private String nom;

    // Relationships:

    @OneToMany(mappedBy = "nationalites")
    private Collection<DataParties> dataParties;

}
