package com.example.devcrew.Service;
import com.example.devcrew.Reposetory.equipementRepository;
import com.example.devcrew.entities.equipement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class equipementService implements Iequipement{

    @Autowired
    equipementRepository equipementRepository;

    @Override
    public equipement Addequipement(equipement eq) {return equipementRepository.save(eq);}
}
