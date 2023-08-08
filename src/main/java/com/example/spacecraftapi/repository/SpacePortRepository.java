package com.example.spacecraftapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spacecraftapi.model.SpacePort;

public interface SpacePortRepository extends CrudRepository<SpacePort, Long> {
    
}
