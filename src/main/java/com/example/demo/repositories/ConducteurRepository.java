package com.example.demo.repositories;

import com.example.demo.entities.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConducteurRepository extends JpaRepository<Conducteur,Integer> {
}
