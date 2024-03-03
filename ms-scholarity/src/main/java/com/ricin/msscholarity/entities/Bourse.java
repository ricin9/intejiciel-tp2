package com.ricin.msscholarity.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Bourse {
    Long idBourse;
    Long montant;
    Date dateVirement;
}
