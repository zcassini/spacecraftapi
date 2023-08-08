package com.example.spacecraftapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spacecraftapi.model.Drone;

public interface DroneRepository extends CrudRepository<Drone, Long> {
    
}
