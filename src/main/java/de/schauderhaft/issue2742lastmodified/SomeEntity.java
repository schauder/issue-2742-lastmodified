package de.schauderhaft.issue2742lastmodified;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SomeEntity {

	@Id
	private Long id;
	private String name;

	public SomeEntity(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public SomeEntity() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
