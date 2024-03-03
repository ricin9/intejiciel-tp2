package com.ricin.msscholarity;

import com.ricin.msscholarity.entities.Etablissement;
import com.ricin.msscholarity.entities.Etudiant;
import com.ricin.msscholarity.repos.EtablissementRepository;
import com.ricin.msscholarity.repos.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class MsScholarityApplication implements CommandLineRunner {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    EtablissementRepository etablissementRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsScholarityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etablissement e1 = etablissementRepository.save(new Etablissement(null, "etablissement 1", null));
        Etablissement e2 = etablissementRepository.save(new Etablissement(null, "etablissement 2", null));

        etudiantRepository.save(new Etudiant(null, "etudiant 1", new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-19"), e1, 1L, 1L, null, null));
        etudiantRepository.save(new Etudiant(null, "etudiant 2", new SimpleDateFormat("yyyy-MM-dd").parse("2003-03-19"),e1, 1L,2L, null, null));
        etudiantRepository.save(new Etudiant(null, "etudiant 3", new SimpleDateFormat("yyyy-MM-dd").parse("2004-03-19"),e1, 1L,3L, null ,null));
        etudiantRepository.save(new Etudiant(null, "etudiant 4", new SimpleDateFormat("yyyy-MM-dd").parse("2005-03-19"),e2, 2L, 1L, null ,null));
        etudiantRepository.save(new Etudiant(null, "etudiant 5", new SimpleDateFormat("yyyy-MM-dd").parse("2006-03-19"),e2, 2L, 1L, null ,null));
    }
}
