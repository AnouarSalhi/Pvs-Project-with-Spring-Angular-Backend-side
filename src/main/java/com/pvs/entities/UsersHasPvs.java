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
public class UsersHasPvs {
    @Id
    @GeneratedValue
    private long id;

    // RelationShips:

    @ManyToOne
    private Pv pv;

    @ManyToOne
    private User user;

    @ManyToOne
    private Traiteds traiteds;
}
