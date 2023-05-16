package com.example.devcrew.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name="chauffeur")
public class chauffeur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idchauffeur;

    private int cin;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date datenaissance;
    private String adresse;
    private String img;
    private int tel;
    private int numeropermis;
    @Temporal(TemporalType.DATE)
    private Date dateexpirationpermis;
    private String typepermis;
   private boolean disponible;
    @OneToMany(mappedBy = "chauffeur",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<reclamation> reclamation;
    public chauffeur(){}


}
