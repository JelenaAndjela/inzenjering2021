package inz.social_engineering.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar{

	public ToolBar() {
		
		JLabel label = new JLabel();
        label.setForeground(Color.BLACK);
        label.setText("Bro, do you even code?");
        this.add(label);

	}
}
