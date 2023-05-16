package com.example.devcrew.Service;

import com.example.devcrew.entities.bondecarburation;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.devcrew.Reposetory.bondecarburationRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class bondecarburationService {
    @Autowired bondecarburationRepository bondecarburationRepository;

    public bondecarburation addbondecarburation(bondecarburation bc){
        return bondecarburationRepository.save(bc);

    }
    public List<bondecarburation> afficherbondecarburation(){
        return bondecarburationRepository.findAll();
    }
    public bondecarburation updatebondecarburation(bondecarburation bc){
        return bondecarburationRepository.save(bc);
    }

    public void deletebondecarburation(Long id){
        bondecarburationRepository.deleteById(id);
    }



    public bondecarburation findb(Long id){
        return bondecarburationRepository.findById(id).get();

    }

}
