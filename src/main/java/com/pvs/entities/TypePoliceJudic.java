package com.pvs.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class TypePoliceJudic {
    @Id
    @GeneratedValue
    private long id;
    private String nom;

    @OneToMany(mappedBy = "typePoliceJudic")
    private Collection<Pv> pvs;

    @OneToMany(mappedBy = "typePoliceJudic")
    private Collection<PvsReponses> pvsReponses;

}
