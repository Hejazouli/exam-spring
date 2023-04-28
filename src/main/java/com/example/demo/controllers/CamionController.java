package com.example.demo.controllers;

import com.example.demo.entities.Camion;
import com.example.demo.services.CamionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/camion")
public class CamionController {
    private final CamionServiceImpl camionService;

    public CamionController(CamionServiceImpl camionService) {
        this.camionService = camionService;
    }

    @GetMapping("/all")
    public List<Camion> findAllCamions() {
        List<Camion> camions = new ArrayList<>();
        camions = camionService.findAllCamions();
        return camions;
    }

    @PostMapping("/add")
    public Camion addCamion(@RequestBody Camion camion) {
        Camion newCamion = camionService.addCamion(camion);
        return newCamion;
    }
    @GetMapping("/find/{id}")
    public Optional<Camion> getPersonneById (@PathVariable("id") Integer id) {
        Optional<Camion> camion = camionService.findCamionById(id);
        return camion;
    }
    @PutMapping("/update")
    public Camion updatePersonne(@RequestBody Camion camion) {
        Camion updatePersonne = camionService.updateCamion(camion);
        return updatePersonne;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersonne(@PathVariable("id") Integer id) {
        camionService.deleteCamion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
