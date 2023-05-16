package com.example.devcrew.Controller;

import com.example.devcrew.entities.bondecarburation;
import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.vehicule;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.devcrew.Service.bondecarburationService;

import java.util.List;

@RestController
@RequestMapping("bondecarburation")
@CrossOrigin(origins ="http://localhost:4200")

public class bondecarburationController {
    @Autowired bondecarburationService bondecarburationService;

    @PostMapping("/add")
    public bondecarburation addbondecarburation(@RequestBody bondecarburation bc){
        return bondecarburationService.addbondecarburation(bc);
    }

    @GetMapping("/getall")
    public List<bondecarburation> affichebondecarburation(){
        return bondecarburationService.afficherbondecarburation();
    }

    @PutMapping("/update/{id}")
    public  bondecarburation updatebondecarburation(@PathVariable Long id,@RequestBody bondecarburation bc){
        bc.setIdbon(id);
        return bondecarburationService.updatebondecarburation(bc);

    }

    @DeleteMapping("/delete/{id}")
    public void deletedecarburation(@PathVariable Long id){
        bondecarburationService.deletebondecarburation(id);
    }



    @GetMapping("/rechercheid/{id}")
    public bondecarburation findchauffeur(@PathVariable Long id) {
        return bondecarburationService.findb(id);
    }
}
