package com.ricin.msscholarity.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    @Column(nullable = false)
    private String name;


    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idEtablissement")
    private Etablissement etablissement;

    @Column
    private Long idFormation;

    @Transient
    private Formation formation;
}
