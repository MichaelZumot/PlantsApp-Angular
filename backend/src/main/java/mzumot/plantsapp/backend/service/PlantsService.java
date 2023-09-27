package mzumot.plantsapp.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mzumot.plantsapp.backend.model.Plant;
import mzumot.plantsapp.backend.repository.PlantsRepository;


public class PlantsService {

    @Autowired
    private PlantsRepository plantRepository;

    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    public Plant getPlantById(Long id) {
        return plantRepository.findById(id).orElse(null);
    }

    public void savePlant(Plant plant) {
        plantRepository.save(plant);
    }

    public void deletePlant(Long id) {
        plantRepository.deleteById(id);
    }

}
