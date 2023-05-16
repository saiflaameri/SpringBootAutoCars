package com.example.devcrew.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@Table ( name ="bondecarburation")

public class bondecarburation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idbon;

    private String  refdebonde;
    private float montant;
    private String station;
    private float cout ;

    @ManyToOne()
    private vehicule vehicule;

    public bondecarburation(){

    }
}
