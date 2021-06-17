package inz.social_engineering.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jdesktop.swingx.JXFrame;



public class AppFrame extends JXFrame{
	
	private static final String SUPPORT_SYSTEM = "App";
	private static final Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
	public static final String MAIN_DASHBOARD = "main-dashboard";
	
	private JPanel cards;
	private MainDashboardPanel mainDashboardPanel;
	private CardLayout cardLayout;
	private ToolBar toolbar;
	private StatusBar statusBar;
	private CompanyListScrollPane companyListScrollPane;

	public AppFrame() {
		this.setTitle(SUPPORT_SYSTEM);
		this.setMinimumSize(new Dimension((int) (3 * screenDimension.getWidth() / 4), (int) (3 * screenDimension.getHeight() / 4)));
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.toolbar = new ToolBar();
		this.setToolBar(toolbar);
		
		this.companyListScrollPane = new CompanyListScrollPane();
		this.add(this.companyListScrollPane, BorderLayout.WEST);
	
		this.statusBar = new StatusBar();
		this.setStatusBar(statusBar);
	}
	
	public static Dimension getScreenDimension() {
		return screenDimension;
	}


	
	

}
