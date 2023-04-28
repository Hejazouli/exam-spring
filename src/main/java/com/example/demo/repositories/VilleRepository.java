package com.example.demo.repositories;

import com.example.demo.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville,Integer> {
}
