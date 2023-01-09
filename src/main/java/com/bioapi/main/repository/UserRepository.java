package com.bioapi.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bioapi.main.model.UserAuth;

public interface UserRepository extends JpaRepository<UserAuth, Long>{
    UserAuth findByUsername(String username);
}
