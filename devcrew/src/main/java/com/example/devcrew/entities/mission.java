package com.example.devcrew.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class mission implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idmission;

    private String description;
    @Temporal(TemporalType.DATE)
    private Date datedebut;
    @Temporal(TemporalType.DATE)
    private Date datefin;

    private String pointdepart;
    private String pointarrive;

    public enum etatmission {
        EN_ATTENTE,
        EN_COURS,
        TERMINEE,
        ANNULEE
    }

    @Enumerated(EnumType.STRING)
    private etatmission etatmission;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<chauffeur> chauffeurs;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<vehicule> vehicules;


    public mission(){}
}
