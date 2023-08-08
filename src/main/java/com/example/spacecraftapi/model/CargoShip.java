package com.example.spacecraftapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class CargoShip extends MannedCraft {
    private boolean hasStorageModule;

    @ManyToOne
    private SpacePort spacePort;
    
    public CargoShip() {

    }

    public CargoShip(String name) {
        super(name);
        this.hasStorageModule = true;
    }

    public boolean isHasStorageModule() {
        return hasStorageModule;
    }

    public void setHasStorageModule(boolean hasStorageModule) {
        this.hasStorageModule = hasStorageModule;
    }

    public SpacePort getSpacePort() {
        return spacePort;
    }

    public void setSpacePort(SpacePort spacePort) {
        this.spacePort = spacePort;
    }

}
