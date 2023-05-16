package com.example.devcrew.Reposetory;

import com.example.devcrew.entities.vignette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vignetteRepository extends JpaRepository<vignette,Long> {
}
