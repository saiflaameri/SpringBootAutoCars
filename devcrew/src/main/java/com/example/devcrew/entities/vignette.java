package com.example.devcrew.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@ToString
@AllArgsConstructor
@Table(name="vignette")
public class vignette implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idvignette;
    private String puissancemoteur;
    private String typecarburant;
    @Temporal(TemporalType.DATE)
    private Date datefin;


    @OneToOne(mappedBy = "vignette",cascade = CascadeType.ALL)

    private vehicule vehicule;



    public vignette(){

}
}
