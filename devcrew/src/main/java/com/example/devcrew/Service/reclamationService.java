package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.reclamationRepository;
import com.example.devcrew.entities.rapportvoiture;
import com.example.devcrew.entities.reclamation;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reclamationService {

    @Autowired
    reclamationRepository rr;

    public reclamation add(reclamation re){
        return rr.save(re);
    }

    public List<reclamation> getall(){
        return rr.findAll();
    }
    public reclamation update(reclamation re){
        return rr.save(re);
    }

    public void delete(Long id){
        rr.deleteById(id);

    }


    public reclamation findb(Long id){
        return rr.findById(id).get();

    }
}
