package com.ricin.msformation;

import com.ricin.msformation.entities.Formation;
import com.ricin.msformation.repos.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsFormationApplication implements CommandLineRunner {

    @Autowired
    FormationRepository formationRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        formationRepository.save(new Formation(null, "formation 1", 5));
        formationRepository.save(new Formation(null, "formation 2", 10));
        formationRepository.save(new Formation(null, "formation 3",12));
    }
}
