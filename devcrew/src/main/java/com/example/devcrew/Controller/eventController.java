package com.example.devcrew.Controller;

import com.example.devcrew.Service.Ievent;
import com.example.devcrew.Service.eventService;
import com.example.devcrew.entities.equipement;
import com.example.devcrew.entities.event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins ="http://localhost:4200")

public class eventController {
    @Autowired
    Ievent ievent;
    @Autowired
    eventService eventService;
    equipement equipement;

    @PostMapping("/addevent") //nafso f angular
    public event addevent(@RequestBody event e) {
        return ievent.Addevent(e);
    }

    @GetMapping("/getAllevent")
    public List<event> getAllEvent() {
        return ievent.getAllevent();
    }

    @GetMapping("/rechercheevent/{id}")
    public event findevent(@PathVariable Long id) {
        return ievent.findevent(id);
    }

    @DeleteMapping("/deleteevent/{id}")
    public void deleteevent(@PathVariable Long id) {
        ievent.deleteevent(id);
    }

    @PutMapping("/update/{id}")
    public event updateEvent(@PathVariable Long id, @RequestBody event e) {
        e.setIdevent(id);
        return ievent.updateEvent(e);
    }

    @GetMapping("/ecount")
    public long countevent(@RequestBody event e) {
        return ievent.countevent();
    }


    @GetMapping("/test/{id}")
    public List<equipement> afeq(@PathVariable long id) {
        event eventt = eventService.findevent(id);
        return eventt.getEquipements();
    }
}





