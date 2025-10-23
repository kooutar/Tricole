package org.example.service;

import org.example.DAO.FournisseurRepository;
import org.example.model.Fournisseur;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class FournisseurService {
    private FournisseurRepository fournisseurRepository;

    public FournisseurService(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }

    public  Fournisseur save(Fournisseur fournisseur){
        return fournisseurRepository.save(fournisseur);
    }

}
