package com.example.spacecraftapi.model;

import jakarta.persistence.Entity;

@Entity
public abstract class AutomatedCraft extends SpaceCraft {
    private boolean requiresMaintenace;

    protected AutomatedCraft() {
        
    }

    protected AutomatedCraft(String name) {
        super(name);
        this.requiresMaintenace = true;
    }
}
