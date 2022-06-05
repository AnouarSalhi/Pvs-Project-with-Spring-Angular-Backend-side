package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Traiteds {
    @Id
    private long id;

    @Column(length=45)
    private String nom;

    @OneToMany(mappedBy = "traiteds")
    private Collection<UsersHasPvs> usersHasPvs;
    @OneToMany(mappedBy = "traiteds")
    private Collection<UserHasPlaints>userHasPlaints;
}