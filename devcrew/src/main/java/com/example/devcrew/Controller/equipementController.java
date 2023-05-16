package com.example.devcrew.Controller;

import com.example.devcrew.Service.Iequipement;
import com.example.devcrew.entities.equipement;
import com.example.devcrew.entities.event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.devcrew.Service.equipementService;

import java.util.List;

@RestController
public class equipementController {
    @Autowired
    Iequipement iequipement;

    @Autowired
    equipementService equipementService;


    @PostMapping("/addequipement")
    public equipement addequipement(@RequestBody equipement eq ){ return iequipement.Addequipement(eq);}




}
