package com.example.spacecraftapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spacecraftapi.model.Probe;

public interface ProbeRepository extends CrudRepository<Probe, Long> {
    
}
