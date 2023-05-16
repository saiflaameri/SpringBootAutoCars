package com.example.devcrew.Reposetory;

import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface chauffeurRepository extends JpaRepository<chauffeur,Long> {
    List<chauffeur> findByDisponible(boolean disponible);
    List<chauffeur> findByCin(int cin);

    List<chauffeur> findByTypepermis(String typepermis);

}
