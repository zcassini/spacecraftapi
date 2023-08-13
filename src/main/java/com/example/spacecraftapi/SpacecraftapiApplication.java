package com.example.spacecraftapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.spacecraftapi.model.SpaceCraft;
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
			// Create SpaceCrafts
			SpaceCraft spaceCraft1 = new SpaceCraft("SpaceCraft 1");
			SpaceCraft spaceCraft2 = new SpaceCraft("SpaceCraft 2");
			SpaceCraft spaceCraft3 = new SpaceCraft("SpaceCraft 3");
			SpaceCraft spaceCraft4 = new SpaceCraft("SpaceCraft 4");

			// Create a SpacePort
			SpacePort spacePort = new SpacePort("Alpha Port");

			// Add SpaceCrafts to SpacePort
			spacePort.addSpaceCraft(spaceCraft1);
			spacePort.addSpaceCraft(spaceCraft2);
			spacePort.addSpaceCraft(spaceCraft3);
			spacePort.addSpaceCraft(spaceCraft4);

			// Create a Volunteer
			Volunteer volunteer = new Volunteer("Jane Doe");
			volunteer.setSpacePort(spacePort);

			// Save the Volunteer
			volunteerRepository.save(volunteer);

			// Save the SpacePort
			spacePortRepository.save(spacePort);
		};
	}

}
