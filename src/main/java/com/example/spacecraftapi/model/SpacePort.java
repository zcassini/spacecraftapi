package com.example.spacecraftapi.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class SpacePort {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    
    @OneToMany(mappedBy = "spacePort")
    private List<SpaceCraft> spaceCrafts = new ArrayList<>();

    @OneToOne(mappedBy = "spacePort")
    private Volunteer volunteer;

    public SpacePort() {
    }

    public SpacePort(String name) {
        this.name = name;
    }

    
   public void removeSpaceCraft(Long id) {
       spaceCrafts.removeIf(spaceCraft -> spaceCraft.getId().equals(id));
   }

    
   public void addSpaceCraft(SpaceCraft spaceCraft) {
    spaceCrafts.add(spaceCraft);
   }

    public void addVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
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

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public List<SpaceCraft> getSpaceCrafts() {
        return spaceCrafts;
    }
    
}
