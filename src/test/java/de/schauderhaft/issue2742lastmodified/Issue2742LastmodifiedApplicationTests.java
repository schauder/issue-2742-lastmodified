package de.schauderhaft.issue2742lastmodified;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@DataJpaTest
class Issue2742LastmodifiedApplicationTests {

	@Autowired
	SomeEntityRepository entities;

	@Test
	void contextLoads() {

		SomeEntity e = new SomeEntity(23L, "one");
		entities.saveAndFlush(e);

	}

}
