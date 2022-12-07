package de.schauderhaft.issue2742lastmodified;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SomeEntityRepository extends JpaRepository<SomeEntity, Long> {

}
