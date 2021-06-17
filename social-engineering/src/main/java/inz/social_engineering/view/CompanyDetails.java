package inz.social_engineering.view;

import java.awt.Font;

import javax.swing.JPanel;

import org.jdesktop.swingx.JXButton;
import org.jdesktop.swingx.JXLabel;

import net.miginfocom.swing.MigLayout;

public class CompanyDetails extends JPanel {
	
	public CompanyDetails() {
		setLayout(new MigLayout("", "[][grow][grow][grow][grow][grow][]", "[][][][][grow][]"));
		
		JXButton btnChoosePatient = new JXButton("Zapocni");
		btnChoosePatient.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		add(btnChoosePatient, "cell 5 0,alignx trailing,aligny top");
		
		JXLabel lblDetailsAboutPatient = new JXLabel();
		lblDetailsAboutPatient.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 42));
		lblDetailsAboutPatient.setText("Patient's medical card ");
		add(lblDetailsAboutPatient, "cell 1 1 5 1,alignx center,growy");
		

	}

}
