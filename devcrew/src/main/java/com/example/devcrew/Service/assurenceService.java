package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.assurenceRepository;
import com.example.devcrew.entities.assurence;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class assurenceService {

    @Autowired
    assurenceRepository assr;

    public assurence add(assurence ae){
        return assr.save(ae);
    }
    public List<assurence> getall(){
        return assr.findAll();
    }

    public assurence update(assurence ae){
        return assr.save(ae);
    }
    public void delete(Long id){
        assr.deleteById(id);
    }
    public assurence findb(Long id){
        return assr.findById(id).get();

    }

}
