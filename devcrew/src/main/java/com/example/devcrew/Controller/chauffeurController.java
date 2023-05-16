package com.example.devcrew.Controller;

import com.example.devcrew.Service.chauffeurService;
import com.example.devcrew.entities.bondecarburation;
import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.event;
import com.example.devcrew.entities.vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chauffeur")
@CrossOrigin(origins ="http://localhost:4200")

public class chauffeurController {
    @Autowired
    chauffeurService chs;

    @PostMapping ("/add")
    public chauffeur add(@RequestBody chauffeur ch){
        return chs.add(ch);
    }

    @GetMapping("/getall")
    public List<chauffeur> getall(){
        return chs.getall();
    }

    @PutMapping("/update/{id}")
    public chauffeur update(@RequestBody chauffeur ch,@PathVariable Long id){
        ch.setIdchauffeur(id);
        return chs.update(ch);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        chs.delete(id);
    }
    @GetMapping("/rechercheid/{id}")
    public chauffeur findchauffeur(@PathVariable Long id) {
        return chs.findb(id);
    }
    @GetMapping("/recherche/{disponible}")
    public List<chauffeur> recherche(@PathVariable boolean disponible) {
        return chs.getByDisponibilite(disponible);
    }
    @GetMapping("/recherchecin/{cin}")
    public List<chauffeur> rechercheCin(@PathVariable int cin) {
        return chs.getByCin(cin);
    }

    @GetMapping("/recherchetypepermis/{typepermis}")
    public List<chauffeur> recherchetypepermis(@PathVariable String typepermis) {
        return chs.getByTypepermis(typepermis);
    }
}
