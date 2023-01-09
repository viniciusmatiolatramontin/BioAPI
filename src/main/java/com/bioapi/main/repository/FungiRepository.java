package com.bioapi.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bioapi.main.model.Fungi;

public interface FungiRepository extends JpaRepository<Fungi, Long> {
    
}
