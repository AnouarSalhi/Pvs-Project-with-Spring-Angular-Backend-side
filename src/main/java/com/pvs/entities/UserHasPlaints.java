package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserHasPlaints {

    @Id
    private long id;

    // RelationShips:
    @ManyToOne
    private User user;
    @ManyToOne
    private Plaints plaints;
    @ManyToOne
    private Traiteds traiteds;

}
