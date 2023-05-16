package com.example.devcrew.Controller;

import com.example.devcrew.Service.rapportService;
import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.rapportvoiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rapport/")
@CrossOrigin(origins ="http://localhost:4200")


public class rapportvoiturController {
    @Autowired rapportService rs;

    @PostMapping("/add")
    public rapportvoiture add(@RequestBody rapportvoiture rv){
       return rs.add(rv);    }

    @GetMapping("/getall")
    public List<rapportvoiture> getalll(){
        return rs.getall();
    }
    @PutMapping("/update/{id}")
    public rapportvoiture update(@RequestBody rapportvoiture rv,@PathVariable Long id){
        rv.setIdrapport(id);
        return rs.update(rv);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        rs.delete(id);
    }

    @GetMapping("/rechercheid/{id}")
    public rapportvoiture findchauffeur(@PathVariable Long id) {
        return rs.findb(id);
    }
}
