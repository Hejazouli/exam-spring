package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Camion {
    @Id
    private int numeroMines;
    private Date dateMiseEnCirculation;
    @ManyToOne
    private TypeCamion typeCamion;
    @OneToMany(mappedBy = "camion")
    private List<Livraison> livraisons=new ArrayList<>();
}
