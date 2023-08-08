package com.example.spacecraftapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ExplorerShip extends MannedCraft {
    private boolean hasSpaceSuit;
    private boolean hasSolarPanels;

    @ManyToOne
    private SpacePort spacePort;

    public ExplorerShip() {

    }

    public ExplorerShip(String name, boolean hasSpaceSuit, boolean hasSolarPanels) {
        super(name);
        this.hasSpaceSuit = hasSpaceSuit;
        this.hasSolarPanels = hasSolarPanels;
    }

    public boolean isHasSpaceSuit() {
        return hasSpaceSuit;
    }

    public void setHasSpaceSuit(boolean hasSpaceSuit) {
        this.hasSpaceSuit = hasSpaceSuit;
    }

    public boolean isHasSolarPanels() {
        return hasSolarPanels;
    }

    public void setHasSolarPanels(boolean hasSolarPanels) {
        this.hasSolarPanels = hasSolarPanels;
    }

    public SpacePort getSpacePort() {
        return spacePort;
    }

    public void setSpacePort(SpacePort spacePort) {
        this.spacePort = spacePort;
    }

    

}
