package com.example.devcrew.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name="benfificaire")
public class benificaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idbenificaire;

    private int cin;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date datenaissance;
    private String adresse;
    private String img;
    private int tel;
    private int numeropermis;
    private String poste;
    @OneToOne(mappedBy = "benificaire",cascade = CascadeType.ALL)
    @JsonIgnore
    private vehicule vehicule;


    public benificaire(){

    }

}
