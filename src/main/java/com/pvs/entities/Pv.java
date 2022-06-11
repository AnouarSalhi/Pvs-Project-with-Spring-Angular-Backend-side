package com.pvs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
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
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private TypeSourcePvs typeSourcePvs;
    // I commented this lines to keep it by default
    //@Column(length=20)
    //@JoinColumn(name = "sourcePvs",nullable = false)
    //@JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    private SourcePvs sourcePvs;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private TypePoliceJudic  typePoliceJudic;
    private int numEnvoi;
    private Date datePvs;
    private String heureRealisation;
    private boolean contreInnconue;
    private String subjectPv;

    @OneToMany(mappedBy = "pv")
    private Collection<UsersHasPvs> usersHasPvs;

    @OneToMany(mappedBy = "pv")
    private Collection<PvsHasDataParties> pvsHasDataParties;
}
