package com.example.devcrew.Reposetory;

import com.example.devcrew.entities.equipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface equipementRepository extends JpaRepository<equipement,Long> {
}
