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

    }
}
