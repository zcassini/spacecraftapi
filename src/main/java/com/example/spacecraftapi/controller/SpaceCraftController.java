package com.example.spacecraftapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spacecraftapi.model.SpaceCraft;
import com.example.spacecraftapi.repository.SpaceCraftRepository;

@RestController
@RequestMapping("/spacecrafts")
public class SpaceCraftController {

    @Autowired // depenpency injection
    private SpaceCraftRepository cargoShipRepository;

    @GetMapping("/{id}")
    public ResponseEntity<SpaceCraft> getCargoShipById(@PathVariable Long id) {
        Optional<SpaceCraft> cargoShip = cargoShipRepository.findById(id);
        return cargoShip.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}