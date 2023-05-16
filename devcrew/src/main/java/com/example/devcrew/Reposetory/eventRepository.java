package com.example.devcrew.Reposetory;

import com.example.devcrew.entities.event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface eventRepository  extends JpaRepository<event,Long> {

}
