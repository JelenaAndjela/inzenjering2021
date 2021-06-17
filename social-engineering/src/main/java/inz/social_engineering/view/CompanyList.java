package inz.social_engineering.view;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.jdesktop.swingx.JXList;

import inz.social_engineering.AppSingleton;
import inz.social_engineering.model.Company;
import inz.social_engineering.model.Korisnik;

public class CompanyList extends JXList{

	private DefaultListModel<Company> companyListModel;
	
	public CompanyList() {
		super(true);
		this.companyListModel = new DefaultListModel<Company>();
		this.initModel();
		this.setModel(this.companyListModel);
		this.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
	}

	public DefaultListModel<Company> getCompanyListModel() {
		return companyListModel;
	}

	private void initModel() {
		Korisnik korisnik = AppSingleton.getInstance().getKorisnik();
	//	for (Company company : korisnik.getKompanije()) {
	//		this.companyListModel.addElement(company);
	//	}
		
		this.companyListModel.addElement(new Company("Kompanija1"));
		
		
		this.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(((Company)CompanyList.this.getSelectedValue()));
				
				
			}
			
		});
		
	}
	
	
	
}
