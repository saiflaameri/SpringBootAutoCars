package com.example.devcrew.Controller;

import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.devcrew.Service.vehiculeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicule")
@CrossOrigin(origins ="http://localhost:4200")

public class vehiculeController {
    @Autowired
    vehiculeService vehiculeService;


    @PostMapping("/add")
    public vehicule addvehicule( @RequestBody vehicule v){
       return vehiculeService.addvehicule(v);
    }


    @GetMapping("/getall")
    public List<vehicule> getallvehicule(){
        return vehiculeService.affichevehicule();
    }
    @PutMapping("/update/{id}")
    public vehicule updatevehicule(@RequestBody vehicule v,@PathVariable long id){
        v.setIdvehicule(id);
        return vehiculeService.updatevehicule(v);
    }
    @DeleteMapping("delete/{id}")
    public void deletevehicule(@PathVariable Long id){
        vehiculeService.deletevehicule(id);

    }
    @GetMapping("/recherche/{disponible}")
    public List<vehicule> recherche(@PathVariable boolean disponible) {
        return vehiculeService.getByDisponibilite(disponible);
    }
    @GetMapping("/rechercheid/{id}")
    public vehicule findchauffeur(@PathVariable Long id) {
        return vehiculeService.findb(id);
    }


    @GetMapping("/count")
    public long count(@RequestBody vehicule vh){
        return vehiculeService.countv();
    }

}
