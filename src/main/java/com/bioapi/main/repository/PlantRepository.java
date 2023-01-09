package com.bioapi.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bioapi.main.model.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {
    
}
