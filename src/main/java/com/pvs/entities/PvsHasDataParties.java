package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PvsHasDataParties {
    @Id
    @GeneratedValue
    private long id;

    // RelationShips:
    @ManyToOne
    private DataParties dataParties;
    @ManyToOne
    private Pv pv;
}
