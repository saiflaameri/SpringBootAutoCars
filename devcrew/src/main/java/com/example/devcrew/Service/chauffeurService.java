package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.chauffeurRepository;
import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class chauffeurService {
    @Autowired
    chauffeurRepository chauf;

    public chauffeur add(chauffeur ch) {
        return chauf.save(ch);

    }

    public List<chauffeur> getall() {
        return chauf.findAll();
    }

    public chauffeur update(chauffeur ch) {
        return chauf.save(ch);
    }

    public void delete(Long id) {
        chauf.deleteById(id);
    }

    public List<chauffeur> getByDisponibilite(boolean disponible) {
        if (disponible) {
            return chauf.findByDisponible(true);
        } else {
            return chauf.findByDisponible(false);

        }
    }

    public List<chauffeur> getByCin(Integer cin){
        if (cin !=null) {
            return chauf.findByCin(cin);
        } else {
            return new ArrayList<>();
        }
    }

    public List<chauffeur> getByTypepermis(String typepermis) {
        if (typepermis != null) {
            return chauf.findByTypepermis(typepermis);
        } else {
            return new ArrayList<>();
        }
    }


    public chauffeur findb(Long id){
        return chauf.findById(id).get();

    }
}
