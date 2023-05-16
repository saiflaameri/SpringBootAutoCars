package com.example.devcrew.Controller;

import com.example.devcrew.Service.visiteService;
import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.visite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visite")
@CrossOrigin(origins ="http://localhost:4200")

public class visiteController {

    @Autowired
    visiteService viss;

    @PostMapping("/add")
    public visite add(@RequestBody visite vi){
    return    viss.add(vi);
    }

    @GetMapping("getall")
    public List<visite> getall(){
        return viss.getall();
    }

    @PutMapping("/update/{id}")
    public visite update(@PathVariable Long id,@RequestBody visite vi){

        vi.setIdvisite(id);
        return viss.update(vi);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        viss.delete(id);
    }

    @GetMapping("/rechercheid/{id}")
    public visite findchauffeur(@PathVariable Long id) {
        return viss.findb(id);
    }



}
