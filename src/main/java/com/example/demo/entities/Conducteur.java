package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Conducteur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroSS;
    private String nom;
    @OneToMany(mappedBy = "conducteur")
    private List<Livraison> livraisons=new ArrayList<>();
    @ManyToOne
    private Ville ville;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<TypeCamion> typeCamions=new ArrayList<>();
}
