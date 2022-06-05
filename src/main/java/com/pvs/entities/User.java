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
public class User {
    @Id
    private long id;
    @Column(length =45)
    private String nom;
    @Column(length =45)
    private String email;
    @Column(length =45)
    private String password;

    @ManyToOne
    private Roles roles;

    @OneToMany(mappedBy = "user")
    private Collection<UsersHasPvs> usersHasPvs;

    @OneToMany(mappedBy = "user")
    private Collection<UserHasPlaints> userHasPlaints;
}
