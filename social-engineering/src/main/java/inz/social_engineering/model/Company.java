package inz.social_engineering.model;

public class Company {

	private String name;
	
	public Company (String name) {
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
	
	
}
