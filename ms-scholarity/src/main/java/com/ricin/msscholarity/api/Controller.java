package com.ricin.msscholarity.api;

import com.ricin.msscholarity.entities.Etudiant;
import com.ricin.msscholarity.entities.FormationProxy;
import com.ricin.msscholarity.repos.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    FormationProxy formationProxy;
    @GetMapping("/etudiant/{id}")
    public Etudiant getEtudiant(@PathVariable("id") Long id) {
        Etudiant e = etudiantRepository.findById(id).get();
        e.setFormation(formationProxy.getF(e.getIdFormation()));
        return e;
    }
}
