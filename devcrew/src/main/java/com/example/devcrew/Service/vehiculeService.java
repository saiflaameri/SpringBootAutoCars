package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.vehiculeRepository;
import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class vehiculeService{
    @Autowired vehiculeRepository vehiculeRepository;


    public vehicule addvehicule(vehicule v){
        return vehiculeRepository.save(v);
    }

    public List<vehicule> affichevehicule(){
        return vehiculeRepository.findAll();
    }
    public vehicule updatevehicule(vehicule v){
        return vehiculeRepository.save(v);
    }

    public void deletevehicule(long id){
        vehiculeRepository.deleteById(id);
    }

    public List<vehicule> getByDisponibilite(boolean disponible) {
        if (disponible) {
            return vehiculeRepository.findByDisponible(true);
        } else {
            return vehiculeRepository.findByDisponible(false) ;

        }

    }

    public vehicule findb(Long id){
        return vehiculeRepository.findById(id).get();

    }

    public Long countv(){
        return vehiculeRepository.count();
    }

}
