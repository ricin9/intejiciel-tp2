package com.ricin.msbourse.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBourse;

    @Column()
    private Long montant;

    @Temporal(TemporalType.DATE)
    private Date dateVirement;
}
