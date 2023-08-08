package com.example.spacecraftapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.spacecraftapi.model.CargoShip;
import com.example.spacecraftapi.model.Drone;
import com.example.spacecraftapi.model.ExplorerShip;
import com.example.spacecraftapi.model.Probe;
import com.example.spacecraftapi.model.SpacePort;
import com.example.spacecraftapi.model.Volunteer;
import com.example.spacecraftapi.repository.SpacePortRepository;
import com.example.spacecraftapi.repository.VolunteerRepository;

@SpringBootApplication
public class SpacecraftapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpacecraftapiApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataInitializer(SpacePortRepository spacePortRepository,
			VolunteerRepository volunteerRepository) {
		return args -> {
			// Create AutomatedCraft ships
			Probe probe1 = new Probe("Probe 1");
			Probe probe2 = new Probe("Probe 2");
			Drone drone1 = new Drone("Drone 1");
			Drone drone2 = new Drone("Drone 2");

			// Create MannedCraft ships
			CargoShip cargoShip1 = new CargoShip("Cargo Ship 1");
			CargoShip cargoShip2 = new CargoShip("Cargo Ship 2");
			ExplorerShip explorerShip1 = new ExplorerShip("Explorer Ship 1", true, true);
			ExplorerShip explorerShip2 = new ExplorerShip("Explorer Ship 2", true, false);

			// Create a SpacePort
			SpacePort spacePort = new SpacePort("Alpha Port");

			// Add ships to SpacePort
			spacePort.addCargoShip(cargoShip2);
			spacePort.addCargoShip(cargoShip1);
			spacePort.addDrone(drone1);
			spacePort.addDrone(drone2);
			spacePort.addExplorerShip(explorerShip1);
			spacePort.addExplorerShip(explorerShip2);
			spacePort.addProbe(probe1);
			spacePort.addProbe(probe2);

			// Create a Volunteer
			Volunteer volunteer = new Volunteer("John Doe");
			volunteer.setSpacePort(spacePort);

			// Save the Volunteer
			volunteerRepository.save(volunteer);

			// Save the SpacePort
			spacePortRepository.save(spacePort);
		};
	}

}
