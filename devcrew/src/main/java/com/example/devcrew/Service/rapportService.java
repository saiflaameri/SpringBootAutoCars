package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.rapportRepository;
import com.example.devcrew.entities.rapportvoiture;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class rapportService {
      @Autowired rapportRepository rapport;

    public rapportvoiture add(rapportvoiture rv){
        return rapport.save(rv);
    }

    public List<rapportvoiture> getall(){
        return rapport.findAll();
    }
    public rapportvoiture update(rapportvoiture rv){
        return rapport.save(rv);
    }

    public void delete(Long id){
        rapport.deleteById(id);

    }

    public rapportvoiture findb(Long id){
        return rapport.findById(id).get();

    }
}
