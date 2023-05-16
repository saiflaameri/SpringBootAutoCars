package com.example.devcrew.Controller;

import com.example.devcrew.Service.assurenceService;
import com.example.devcrew.entities.assurence;
import com.example.devcrew.entities.chauffeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assurence")
@CrossOrigin(origins ="http://localhost:4200")

public class assurenceController {

    @Autowired
    assurenceService asu;

    @PostMapping("/add")
    public assurence add(@RequestBody assurence as){
        return asu.add(as);
    }

    @GetMapping("/getall")
    public List<assurence> getall(){
     return     asu.getall();
    }

    @PutMapping("/update/{id}")
    public assurence update(@RequestBody assurence ae,@PathVariable Long id){
       ae.setIdassurence(id);
        return asu.update(ae);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        asu.delete(id);

    }

    @GetMapping("/rechercheid/{id}")
    public assurence findchauffeur(@PathVariable Long id) {
        return asu.findb(id);
    }

}
