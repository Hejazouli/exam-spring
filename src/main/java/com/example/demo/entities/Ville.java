package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Ville {
    @Id
    @Column(length = 5,nullable = false)
    private int codePostal;
    private String nom;
    @ManyToOne
    private Livraison livraison;
    @ManyToOne
    private Conducteur conducteur;
}
