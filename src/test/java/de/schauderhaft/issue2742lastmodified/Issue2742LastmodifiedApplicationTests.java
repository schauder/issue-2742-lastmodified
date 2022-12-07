package de.schauderhaft.issue2742lastmodified;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.support.TransactionTemplate;

@DataJpaTest
@Transactional(Transactional.TxType.NEVER)
class Issue2742LastmodifiedApplicationTests {

	@Autowired
	SomeEntityRepository entities;

	@Autowired
	TransactionTemplate txt;

	@Test
	void contextLoads() {

		SomeEntity saved = txt.execute(tx -> {

			SomeEntity e = new SomeEntity((Long)null, "one");
			return entities.saveAndFlush(e);
		});
		System.out.println(saved.getCreated());
		System.out.println(entities.findById(saved.getId()).get().getCreated());
	}

}
