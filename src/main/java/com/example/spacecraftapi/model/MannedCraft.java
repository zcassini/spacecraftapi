package com.example.spacecraftapi.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class MannedCraft extends SpaceCraft {
    
    protected MannedCraft() {
        
    }

    protected MannedCraft(String name) {
        super(name);
    }       
}
