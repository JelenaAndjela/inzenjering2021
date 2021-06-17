package inz.social_engineering.view;

import org.jdesktop.swingx.JXLoginPane;

import inz.social_engineering.controller.AppLoginService;

public class AppLoginDialog extends JXLoginPane{	
	private static final String WELCOME_MSG = "Welcome to support system. Please log in.";
	
	public AppLoginDialog() {
		super(new AppLoginService());
		this.setMessage(WELCOME_MSG);
	}
	
	public void showLoginDialog() {
		JXLoginPane.Status status = JXLoginPane.showLoginDialog(null, this);
		if(JXLoginPane.Status.CANCELLED == status || 
				JXLoginPane.Status.FAILED == status ||
				JXLoginPane.Status.NOT_STARTED == status) {
				Runtime.getRuntime().exit(0);
			}
	}
	
}