package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeCamion {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 10)
    private String marque;
    @Column(unique = true)
    private String modele;
    private int volumeMax;
    private int poidsMax;
    @OneToMany(mappedBy = "typeCamion")
    private List<Camion> camions=new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tableDeJointure")

    private List<Conducteur> conducteurs=new ArrayList<>();
}
