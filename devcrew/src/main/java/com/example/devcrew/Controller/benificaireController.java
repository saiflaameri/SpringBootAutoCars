package com.example.devcrew.Controller;

import com.example.devcrew.Service.benificaireService;
import com.example.devcrew.entities.benificaire;
import com.example.devcrew.entities.chauffeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:4200")

@RequestMapping("benificaire")
public class benificaireController {
    @Autowired
    benificaireService bs;
    @PostMapping("/add")
    public benificaire add(@RequestBody benificaire b){
    return     bs.add(b);
    }

    @PutMapping("update/{id}")
    public benificaire update(@RequestBody benificaire b,@PathVariable Long id){
        b.setIdbenificaire(id);
        return bs.update(b);
    }

    @GetMapping("getall")
    public List<benificaire> getall(){
        return bs.getall();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        bs.delete(id);
    }
    @GetMapping("/rechercheid/{id}")
    public benificaire findchauffeur(@PathVariable Long id) {
        return bs.findb(id);
    }

}
