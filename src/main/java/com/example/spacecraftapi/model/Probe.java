package com.example.spacecraftapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Probe extends AutomatedCraft {
    
    @ManyToOne
    private SpacePort spacePort;

    public Probe() {

    }

    public Probe(String name) {
        super(name);
    }

    public SpacePort getSpacePort() {
        return spacePort;
    }

    public void setSpacePort(SpacePort spacePort) {
        this.spacePort = spacePort;
    }



}
