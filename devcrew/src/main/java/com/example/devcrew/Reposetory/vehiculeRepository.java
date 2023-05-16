package com.example.devcrew.Reposetory;

import com.example.devcrew.entities.vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface vehiculeRepository extends JpaRepository<vehicule,Long> {
    List<vehicule> findByDisponible(boolean Disponible);

}
