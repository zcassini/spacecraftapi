package com.example.spacecraftapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spacecraftapi.model.Volunteer;
import com.example.spacecraftapi.repository.VolunteerRepository;

@RestController
@RequestMapping("/volunteers")
public class VolunteerController {
    
    @Autowired
    private VolunteerRepository volunteerRepository;

    @GetMapping
    public List<Volunteer> getAllVolunteers() {
        return (List<Volunteer>) volunteerRepository.findAll();
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<Volunteer> getVolunteerById(@PathVariable Long id) {
        Optional<Volunteer> spacePort = volunteerRepository.findById(id);
        return spacePort.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
}
