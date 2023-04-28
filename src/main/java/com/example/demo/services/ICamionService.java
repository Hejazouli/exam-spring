package com.example.demo.services;

import com.example.demo.entities.Camion;

import java.util.List;
import java.util.Optional;

public interface ICamionService {
    public List<Camion> findAllCamions();
    public Optional<Camion> findPersonneById(Long id);
    public Camion addCamion(Camion camion);
    public Camion updateCamion(Camion camion);
    public void deleteCamion(int id);
    public Optional<Camion> findCamionById(Integer id) ;
}
