package com.example.banque_service.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionRequest {
    private Long compteId;
    private double montant;
    private LocalDate date;
    private TypeTransaction type;
}
