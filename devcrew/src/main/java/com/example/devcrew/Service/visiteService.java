package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.visiteRepository;
import com.example.devcrew.entities.vehicule;
import com.example.devcrew.entities.visite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class visiteService {

    @Autowired
    visiteRepository vis;

    public visite add(visite vi){
        return vis.save(vi);
    }

    public List<visite> getall(){
        return vis.findAll();
    }

    public visite update(visite vi){
       return vis.save(vi);
    }

    public void delete( Long id){
        vis.deleteById(id);
    }

    public visite findb(Long id){
        return vis.findById(id).get();

    }
}
