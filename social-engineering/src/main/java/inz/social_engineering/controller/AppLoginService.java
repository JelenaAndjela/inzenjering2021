package inz.social_engineering.controller;

import java.util.HashMap;
import java.util.Map;

import org.jdesktop.swingx.auth.LoginService;

import inz.social_engineering.AppSingleton;
import inz.social_engineering.model.Korisnik;

public class AppLoginService extends LoginService{

	private static final Korisnik dominator = new Korisnik("", "", "No", "Credentials");
	private static final Korisnik inz1 = new Korisnik("ina1", "123", "Ina", "Males");
	private Map<String,Korisnik> korisnici;
	
	public AppLoginService(){
		this.korisnici = new HashMap<String,Korisnik>();
		this.korisnici.put(dominator.getUsername(), dominator);
		this.korisnici.put(inz1.getUsername(), inz1);
		
		AppSingleton.getInstance().setKorisnik(dominator);
	}
	
	@Override
	public boolean authenticate(String name, char[] password, String server) throws Exception {
		// TODO Auto-generated method stub
		Korisnik korisnik = this.korisnici.get(name);
		if(korisnik == null || !korisnik.getPassword().equals(new String(password))){
			return false;
		}
		AppSingleton.getInstance().setKorisnik(korisnik);
		return true;
	}

}
