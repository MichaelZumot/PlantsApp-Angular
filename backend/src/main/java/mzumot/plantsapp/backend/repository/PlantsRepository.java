package mzumot.plantsapp.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mzumot.plantsapp.backend.model.Plant;

public interface PlantsRepository extends JpaRepository<Plant, Long> {

}
