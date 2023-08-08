package com.example.spacecraftapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spacecraftapi.model.SpacePort;
import com.example.spacecraftapi.repository.SpacePortRepository;

@RestController
@RequestMapping("/spaceports")
public class SpacePortController {
    
    @Autowired
    private SpacePortRepository spacePortRepository;

    @GetMapping
    public List<SpacePort> getAllSpacePorts() {
        return (List<SpacePort>) spacePortRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpacePort> getSpacePortById(@PathVariable Long id) {
        Optional<SpacePort> spacePort = spacePortRepository.findById(id);
        return spacePort.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    
}
