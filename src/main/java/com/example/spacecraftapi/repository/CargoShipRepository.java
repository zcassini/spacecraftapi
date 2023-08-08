package com.example.spacecraftapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spacecraftapi.model.CargoShip;

public interface CargoShipRepository extends CrudRepository<CargoShip, Long> {
    
}
