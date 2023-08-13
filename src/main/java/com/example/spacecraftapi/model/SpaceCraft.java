package com.example.spacecraftapi.model;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class SpaceCraft {
    @Id
    @GeneratedValue()
    private Long id;

    private String name;
    private String manufacturer;
    private String model;
    private Date modelYear; 

    protected SpaceCraft() {
    }

    public SpaceCraft(String name) {
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

    
}
