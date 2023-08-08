package com.example.spacecraftapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spacecraftapi.model.Volunteer;

public interface VolunteerRepository  extends CrudRepository<Volunteer, Long> {
    
}
