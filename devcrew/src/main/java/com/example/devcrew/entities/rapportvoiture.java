package com.example.devcrew.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@Table(name="rapportvoiture")
public class rapportvoiture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idrapport;
    private float ksortie;
    private float karrive;
    private float esortie;
    private float earrive;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne()
    private vehicule vehicule;

    public rapportvoiture(){}

}
