package com.example.devcrew.Reposetory;

import com.example.devcrew.entities.rapportvoiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rapportRepository extends JpaRepository<rapportvoiture,Long> {
}
