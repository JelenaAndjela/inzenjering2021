package inz.social_engineering.model;

import java.util.ArrayList;
import java.util.List;

public class Korisnik {

	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private List<Company> kompanije = new ArrayList<Company>();
	
	public Korisnik(String username, String password, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Company> getKompanije() {
		if(kompanije == null) {
			kompanije = new ArrayList<Company>();
		}
		return kompanije;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
	
}
