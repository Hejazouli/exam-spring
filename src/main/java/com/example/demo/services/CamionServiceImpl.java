package com.example.demo.services;

import com.example.demo.entities.Camion;
import com.example.demo.repositories.CamionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CamionServiceImpl implements ICamionService{
    private final CamionRepository camionRepository;

    public CamionServiceImpl(CamionRepository camionRepository) {
        this.camionRepository = camionRepository;
    }

    @Override
    public List<Camion> findAllCamions() {
        return camionRepository.findAll();
    }

    @Override
    public Optional<Camion> findPersonneById(Long id) {
        return Optional.empty();
    }

    @Override
    public Camion addCamion(Camion camion) {
        return camionRepository.save(camion);
    }

    @Override
    public  Camion updateCamion(Camion camion) {
        return camionRepository.save(camion);
    }

    @Override
    public void deleteCamion(int id) {
      camionRepository.deleteById(id);
    }

    @Override
    public Optional<Camion> findCamionById(Integer id) {

            return camionRepository.findById(id);

    }

}
