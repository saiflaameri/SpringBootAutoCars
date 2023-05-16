package com.example.devcrew.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@Table(name="reclamation")
public class reclamation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idreclamation;
    private String sujet;
    private String description;

    @ManyToOne()
    private chauffeur chauffeur;

    public reclamation (){

    }
}
