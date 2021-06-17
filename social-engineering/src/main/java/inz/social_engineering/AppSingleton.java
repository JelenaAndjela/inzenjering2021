package inz.social_engineering;

import inz.social_engineering.model.Company;
import inz.social_engineering.model.Korisnik;
import inz.social_engineering.view.AppFrame;

public class AppSingleton {
	
	private static AppSingleton instance = new AppSingleton();
	private Korisnik korisnik;
	private Company company;
	private AppFrame appFrame;

	private AppSingleton() {
	}
	
	public static AppSingleton getInstance() {
		return instance;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	public AppFrame getAppFrame() {
		return appFrame;
	}
	public void setAppFrame(AppFrame appFrame) {
		this.appFrame = appFrame;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
