package com.bioapi.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bioapi.main.model.Monera;

public interface MoneraRepository extends JpaRepository<Monera, Long>{
    
}
