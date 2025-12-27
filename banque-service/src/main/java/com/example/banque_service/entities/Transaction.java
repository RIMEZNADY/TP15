package com.example.banque_service.entities;



import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double montant;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private TypeTransaction type;

    @ManyToOne
    private Compte compte;
}
