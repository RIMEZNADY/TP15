package com.example.banque_service.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CompteRequest {
    private double solde;
    private LocalDate dateCreation;
    private TypeCompte type;
}
