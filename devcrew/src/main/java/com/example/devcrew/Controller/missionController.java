package com.example.devcrew.Controller;

import com.example.devcrew.Service.missionService;
import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mission")
@CrossOrigin(origins ="http://localhost:4200")

public class missionController {
    @Autowired
    missionService ms;


    @PostMapping("/add")
    public mission add(@RequestBody mission m){
        return ms.add(m);
    }

    @PutMapping("/update")
    public mission update(@RequestBody mission m,@PathVariable Long id){
        m.setIdmission(id);
        return ms.update(m);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        ms.delete(id);
    }

    @GetMapping("/getall")
    public List<mission> getall(){
        return ms.getall();
    }

    @GetMapping("/rechercheid/{id}")
    public mission findchauffeur(@PathVariable Long id) {
        return ms.findb(id);
    }
}
