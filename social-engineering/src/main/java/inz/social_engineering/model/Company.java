package inz.social_engineering.model;

import java.util.UUID;

public class Company {

	private UUID id;
	private String name;
	
	//cita iz baze
	public Company(String id, String name) {
		this.id=UUID.fromString(id);
		this.name=name;
	}
	
	//pravi nov
	public Company(String name) {
		this.id=UUID.randomUUID();
		this.name=name;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "-"+this.name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	
}
