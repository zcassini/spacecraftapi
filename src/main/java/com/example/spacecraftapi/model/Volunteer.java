package com.example.spacecraftapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Volunteer {
    @Id
    @GeneratedValue
    private Long id;
     
    private String name;

    @OneToOne
    private SpacePort spacePort;

    public Volunteer() {
    }

    public Volunteer(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpacePort getSpacePort() {
        return spacePort;
    }

    public void setSpacePort(SpacePort spacePort) {
        this.spacePort = spacePort;
    }

    
    
}
