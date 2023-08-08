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
    private List<Drone> drones = new ArrayList<>();

    @OneToMany(mappedBy = "spacePort")
    private List<Probe> probes = new ArrayList<>();

    @OneToMany(mappedBy = "spacePort")
    private List<CargoShip> cargoShips = new ArrayList<>();

    @OneToMany(mappedBy =  "spacePort")
    private List<ExplorerShip> explorerShips = new ArrayList<>();

    @OneToOne(mappedBy = "spacePort")
    private Volunteer volunteer;

    public SpacePort() {
    }

    public SpacePort(String name) {
        this.name = name;
    }

    public void addDrone(Drone drone) {
        drones.add(drone);
    }

    public void addProbe(Probe probe) {
        probes.add(probe);
    }

    public void addCargoShip(CargoShip cargoShip) {
        cargoShips.add(cargoShip);
    }

    public void addExplorerShip(ExplorerShip explorerShip) {
        explorerShips.add(explorerShip);
    }
    
   public void removeDrone(Long id) {
       drones.removeIf(drone -> drone.getId().equals(id));
   }

   public void removeDrone(String name) {
       drones.removeIf(drone -> drone.getName().equals(name));
   }

    public void removeProbe(Long id) {
         probes.removeIf(probe -> probe.getId().equals(id));
    }

    public void removeProbe(String name) {
        probes.removeIf(probe -> probe.getName().equals(name));
    }

    public void removeCargoShip(Long id) {
        cargoShips.removeIf(cargoShip -> cargoShip.getId().equals(id));
    }

    public void removeCargoShip(String name) {
        cargoShips.removeIf(cargoShip -> cargoShip.getName().equals(name));
    }

    public void removeExplorerShip(Long id) {
        explorerShips.removeIf(explorerShip -> explorerShip.getId().equals(id));
    }

    public void removeExplorerShip(String name) {
        explorerShips.removeIf(explorerShip -> explorerShip.getName().equals(name));
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

    public List<Drone> getDrones() {
        return drones;
    }

    public void setDrones(List<Drone> drones) {
        this.drones = drones;
    }

    public List<Probe> getProbes() {
        return probes;
    }

    public void setProbes(List<Probe> probes) {
        this.probes = probes;
    }

    public List<CargoShip> getCargoShips() {
        return cargoShips;
    }

    public void setCargoShips(List<CargoShip> cargoShips) {
        this.cargoShips = cargoShips;
    }

    public List<ExplorerShip> getExplorerShips() {
        return explorerShips;
    }

    public void setExplorerShips(List<ExplorerShip> explorerShips) {
        this.explorerShips = explorerShips;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
    
}
