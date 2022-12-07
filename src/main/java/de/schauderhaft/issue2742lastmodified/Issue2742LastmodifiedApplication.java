package de.schauderhaft.issue2742lastmodified;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@SpringBootApplication
@EnableJpaAuditing
public class Issue2742LastmodifiedApplication {

	public static void main(String[] args) {
		SpringApplication.run(Issue2742LastmodifiedApplication.class, args);
	}

	@Autowired
	SomeEntityRepository entities;

}
