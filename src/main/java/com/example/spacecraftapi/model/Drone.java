package com.example.spacecraftapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Drone extends AutomatedCraft {
 
    @ManyToOne
    private SpacePort spacePort;
    
    public Drone() {

    }

    public Drone(String name) {
        super(name);
    }

    public SpacePort getSpacePort() {
        return spacePort;
    }

    public void setSpacePort(SpacePort spacePort) {
        this.spacePort = spacePort;
    }

    
}
