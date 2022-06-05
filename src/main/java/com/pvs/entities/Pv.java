package com.pvs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Collection;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pv implements Serializable {
    @Id
    @GeneratedValue
    @Column(length=20)
    private long id;

    @ManyToOne
    private TypeSourcePvs typeSourcePvs;
    // I commented this lines to keep by default
    //@Column(length=20)
    //@JoinColumn(name = "sourcePvs",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private SourcePvs sourcePvs;

    @ManyToOne
    private TypePoliceJudic  typePoliceJudic;
    private Date numEnvoi;
    private Date datePvs;
    private Date heureRealisation;
    private boolean contreInnconue;

    @OneToMany(mappedBy = "pv")
    private Collection<UsersHasPvs> usersHasPvs;
    @OneToMany(mappedBy = "pv")
    private Collection<PvsHasDataParties> pvsHasDataParties;
}
