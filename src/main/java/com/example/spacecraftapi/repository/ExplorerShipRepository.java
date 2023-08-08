package com.example.spacecraftapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spacecraftapi.model.ExplorerShip;

public interface ExplorerShipRepository extends CrudRepository<ExplorerShip, Long> {
    
}
