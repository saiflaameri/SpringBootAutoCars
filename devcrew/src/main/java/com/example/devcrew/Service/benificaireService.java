package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.benificaireRepository;
import com.example.devcrew.entities.benificaire;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class benificaireService {

    @Autowired
    benificaireRepository br;

    public benificaire add(benificaire b){
        return br.save(b);
    }

    public benificaire update(benificaire b){
        return br.save(b);
    }

    public List<benificaire> getall(){
        return br.findAll();
    }

    public void delete(Long id){
        br.deleteById(id);
    }
    public benificaire findb(Long id){
        return br.findById(id).get();

    }

}

