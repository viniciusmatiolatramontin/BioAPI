package com.bioapi.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bioapi.main.model.Protist;

public interface ProtistRepository extends JpaRepository<Protist, Long> {
    
}
