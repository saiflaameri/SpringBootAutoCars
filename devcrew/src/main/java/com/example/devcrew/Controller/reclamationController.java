package com.example.devcrew.Controller;

import com.example.devcrew.Service.reclamationService;
import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.rapportvoiture;
import com.example.devcrew.entities.reclamation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reclamation")
public class reclamationController {
    @Autowired
    reclamationService recs;

    @PostMapping("/add")
    public reclamation add(@RequestBody reclamation re){
        return recs.add(re);    }

    @GetMapping("/getall")
    public List<reclamation> getalll(){
        return recs.getall();
    }
    @PutMapping("/update/{id}")
    public reclamation update(@RequestBody reclamation re,@PathVariable Long id){
        re.setIdreclamation(id);
        return recs.update(re);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        recs.delete(id);
    }
    @GetMapping("/rechercheid/{id}")
    public reclamation findchauffeur(@PathVariable Long id) {
        return recs.findb(id);
    }
}
