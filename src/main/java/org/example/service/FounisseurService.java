package org.example.service;

import org.example.DAO.FournisseurRepository;
import org.example.model.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class FounisseurService {
    @Autowired
    private FournisseurRepository fournisseurRepository;
    @Transactional
    public  void save(Fournisseur fournisseur){
        fournisseurRepository.save(fournisseur);
    }
}
