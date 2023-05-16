package com.example.devcrew.Controller;

import com.example.devcrew.Service.vignetteService;
import com.example.devcrew.entities.chauffeur;
import com.example.devcrew.entities.vignette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vignette")
@CrossOrigin(origins ="http://localhost:4200")

public class vignetteController {

    @Autowired
    vignetteService vs;


    @GetMapping("getall")
    public List<vignette> getall(){
        return  vs.getall();
    }

    @PostMapping("add")
    public vignette add(@RequestBody vignette vg){
        return vs.add(vg);
    }

    @PutMapping("/update/{id}")
    public vignette update(@RequestBody vignette vg,Long id){
        vg.setIdvignette(id);
        return vs.update(vg);
    }

    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable long id){
        vs.delete(id);
    }
    @GetMapping("/rechercheid/{id}")
    public vignette findchauffeur(@PathVariable Long id) {
        return vs.findb(id);
    }
}
