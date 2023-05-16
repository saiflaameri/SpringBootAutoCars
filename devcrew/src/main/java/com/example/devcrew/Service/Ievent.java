package com.example.devcrew.Service;

import com.example.devcrew.entities.equipement;
import com.example.devcrew.entities.event;

import java.util.List;
import java.util.Optional;

public interface Ievent {
    public event Addevent(event e);



    public List<event> getAllevent();


    public event findevent(Long id);

    public void deleteevent(Long id);

    public event updateEvent(event e);

    public long countevent();

    Optional<event> findById(Long eventId);
}


