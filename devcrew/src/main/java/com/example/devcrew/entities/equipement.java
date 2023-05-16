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
@ToString
@AllArgsConstructor
@Table (name="equipement")
public class equipement  implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ideq;
   private String nomeq;
   private String typeeq;
   private Long prixeq;
   private String image;

   @ManyToOne()
   private event event;

    public equipement(){

    }
}
