package com.example.spacecraftapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spacecraftapi.model.CargoShip;
import com.example.spacecraftapi.repository.CargoShipRepository;

@RestController
@RequestMapping("/cargoships")
public class CargoShipController {
    
    @Autowired // depenpency injection
    private CargoShipRepository cargoShipRepository;

    @GetMapping("/{id}")
    public ResponseEntity<CargoShip> getCargoShipById(@PathVariable Long id) {
        Optional<CargoShip> cargoShip = cargoShipRepository.findById(id);
        return cargoShip.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // @GetMapping("/name/{name}")
    // public ResponseEntity<List<CargoShip>> getCargoShipsBy(@PathVariable String name) {
        

    // }
    }