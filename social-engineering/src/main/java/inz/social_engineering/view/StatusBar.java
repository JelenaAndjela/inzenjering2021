package inz.social_engineering.view;

import java.awt.Font;

import org.jdesktop.swingx.JXLabel;
import org.jdesktop.swingx.JXStatusBar;

import inz.social_engineering.AppSingleton;
import inz.social_engineering.model.Korisnik;

public class StatusBar extends JXStatusBar {
	
	private JXStatusBar.Constraint fillConstraint;
	private DateLabel dateLabel;
	private JXLabel userInfoLabel;

	public StatusBar() {
		this.fillConstraint = new JXStatusBar.Constraint(JXStatusBar.Constraint.ResizeBehavior.FILL);
		initUserInfoLabel(fillConstraint);
		initDateLabel(fillConstraint);
	}
	
	public void initDateLabel(JXStatusBar.Constraint constraint)
	{	
		this.dateLabel = new DateLabel();
//		this.dateLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		this.add(this.dateLabel, this.fillConstraint);	
	}
	
	public void initUserInfoLabel(JXStatusBar.Constraint constraint)
	{	
		this.userInfoLabel = new JXLabel();
		Korisnik korisnik = AppSingleton.getInstance().getKorisnik();
		StringBuilder msgBuilder = new StringBuilder();
		msgBuilder.append("Korisnik: ");
		msgBuilder.append(korisnik.getFirstName());
		msgBuilder.append(" ");
		msgBuilder.append(korisnik.getLastName());
		this.userInfoLabel.setText(msgBuilder.toString());
//		this.userInfoLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		this.add(this.userInfoLabel, constraint);
	}
	
}
