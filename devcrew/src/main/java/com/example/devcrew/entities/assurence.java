package com.example.devcrew.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@Table(name="assurence")
public class assurence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idassurence;

    private String typeaasurence;
    private float tarifbase;
    private float tauxreduction;
    private String tyhpevehicule;
    @Temporal(TemporalType.DATE)
    private Date datedebut;

    @Temporal(TemporalType.DATE)
    private Date datefin;


    @OneToOne(mappedBy = "assurence",cascade = CascadeType.ALL)
    @JsonIgnore
    private vehicule vehicule;




    public assurence(){

    }

}
