package com.ricin.msbourse;

import com.ricin.msbourse.entities.Bourse;
import com.ricin.msbourse.repos.BourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class MsBourseApplication implements CommandLineRunner {
    @Autowired
    BourseRepository bourseRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsBourseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bourseRepository.save(new Bourse(null, 1000L, new SimpleDateFormat("yyyy-MM-dd").parse("2024-02-15")));
        bourseRepository.save(new Bourse(null, 2000L, new SimpleDateFormat("yyyy-MM-dd").parse("2024-02-20")));
        bourseRepository.save(new Bourse(null, 3000L, new SimpleDateFormat("yyyy-MM-dd").parse("2024-02-25")));
        bourseRepository.save(new Bourse(null, 4000L, new SimpleDateFormat("yyyy-MM-dd").parse("2024-03-01")));
    }
}
