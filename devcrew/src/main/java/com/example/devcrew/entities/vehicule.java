package com.example.devcrew.entities;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@Table ( name ="vehicule")
public class vehicule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idvehicule;
    private String marque;
    private String modele;
    @Temporal(TemporalType.DATE)
    private Date annefabrication;
    private String numeroserie;
    private String couleur;
    private String transmission;
    private String photov;
    private boolean disponible;

   @OneToOne(cascade = CascadeType.ALL)
    private assurence assurence;

    @OneToOne(cascade = CascadeType.ALL)
    private visite visite;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private vignette vignette;

    @OneToOne(cascade = CascadeType.ALL)
    private benificaire benificaire;


    @OneToMany(mappedBy = "vehicule",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<bondecarburation> bondecarburations;

    @OneToMany(mappedBy = "vehicule",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<rapportvoiture> rapportvoitures;





    public vehicule(){}



}
