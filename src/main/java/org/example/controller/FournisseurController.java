package org.example.controller;

import org.example.model.Fournisseur;
import org.example.service.FournisseurService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fournisseurs")
public class FournisseurController {
    private FournisseurService fournisseurService;

    public FournisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }
     @GetMapping
     public  String index(){
        return  "salam";
     }
    @PostMapping
    public Fournisseur saveFournisseur(@RequestBody Fournisseur fournisseur){
     return fournisseurService.save(fournisseur);
    }

}
