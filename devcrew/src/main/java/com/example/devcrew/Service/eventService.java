package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.eventRepository;
import com.example.devcrew.entities.equipement;
import com.example.devcrew.entities.event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class eventService implements  Ievent {
    @Autowired
    eventRepository eventRepository;


    @Override
    public event Addevent(event e) {
        return eventRepository.save(e);
    }

    @Override
    public List<event> getAllevent() {
        return eventRepository.findAll();
    }

    @Override
    public event findevent(Long id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public void deleteevent(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public event updateEvent(event e) {
        return eventRepository.save(e);
    }

    @Override
    public long countevent() {
        return eventRepository.count();
    }


    @Override
    public Optional<event> findById(Long eventId) {
        return Optional.empty();
    }


}
