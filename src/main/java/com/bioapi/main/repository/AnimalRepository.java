package com.bioapi.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bioapi.main.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    
}
