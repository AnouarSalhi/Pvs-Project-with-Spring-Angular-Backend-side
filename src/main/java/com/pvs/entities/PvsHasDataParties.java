package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PvsHasDataParties implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    // RelationShips:
    @ManyToOne
    private DataParties dataParties;
    @ManyToOne
    private Pv pv;
}
