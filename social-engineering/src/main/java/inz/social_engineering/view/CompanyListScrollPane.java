package inz.social_engineering.view;

import java.awt.Dimension;

import javax.swing.JScrollPane;

public class CompanyListScrollPane extends JScrollPane{

	private CompanyList companyList;
	
	public CompanyListScrollPane() {
		this.companyList = new CompanyList();
		this.setViewportView(companyList);
		this.setPreferredSize(new Dimension((int)AppFrame.getScreenDimension().width/8,0));
	}
}
