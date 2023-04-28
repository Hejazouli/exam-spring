package com.example.demo.repositories;

import com.example.demo.entities.Camion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamionRepository extends JpaRepository<Camion,Integer> {
}
