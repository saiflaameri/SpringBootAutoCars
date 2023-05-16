package com.example.devcrew.Service;

import com.example.devcrew.Reposetory.vignetteRepository;
import com.example.devcrew.entities.vehicule;
import com.example.devcrew.entities.vignette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vignetteService {
    @Autowired
    vignetteRepository vr;

    public vignette add(vignette vg){
        return vr.save(vg);
    }
    public List<vignette> getall(){
       return vr.findAll();
    }

    public vignette update(vignette vg){
        return vr.save(vg);
    }

    public void delete(Long id){
        vr.deleteById(id);
    }

    public vignette findb(Long id){
        return vr.findById(id).get();

    }

}
