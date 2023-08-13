package com.example.spacecraftapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spacecraftapi.model.SpaceCraft;

public interface SpaceCraftRepository extends CrudRepository<SpaceCraft, Long> {
    
}
