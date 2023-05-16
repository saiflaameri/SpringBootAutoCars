package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.missionRepository;
import com.example.devcrew.entities.mission;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class missionService {

    @Autowired
    missionRepository mr;

    public mission add(mission m){
        return mr.save(m);
    }

    public mission update(mission m){
        return mr.save(m);
    }

    public List<mission> getall(){
        return mr.findAll();
    }

    public void delete(Long id){
        mr.deleteById(id);

    }

    public mission findb(Long id){
        return mr.findById(id).get();

    }
}
