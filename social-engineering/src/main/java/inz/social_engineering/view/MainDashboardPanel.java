package inz.social_engineering.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;


public class MainDashboardPanel extends JPanel{
	
	private CompanyDetails companyDetails;
	private JPanel patientDetailsPane;
	
	public MainDashboardPanel() {
		super(new BorderLayout());
	
		
		patientDetailsPane = new JPanel(new BorderLayout());
		this.add(patientDetailsPane, BorderLayout.CENTER);
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
		
		this.patientDetailsPane.add(this.companyDetails, BorderLayout.CENTER);

	}

	public JPanel getPatientDetailsPane() {
		return patientDetailsPane;
	}

	public void setPatientDetailsPane(JPanel patientDetailsPane) {
		this.patientDetailsPane = patientDetailsPane;
	}
	
	

}
