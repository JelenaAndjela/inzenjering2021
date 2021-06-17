package inz.social_engineering;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


import inz.social_engineering.view.AppFrame;
import inz.social_engineering.view.AppLoginDialog;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try 
		{
    	
			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
		} 
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) { e.printStackTrace(); }
		
    	
    	EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				AppLoginDialog loginDialog = new AppLoginDialog();
				loginDialog.showLoginDialog();
				AppFrame appFrame = new AppFrame();
				AppSingleton.getInstance().setAppFrame(appFrame);
				
				appFrame.setVisible(true);
			}
		});
    }
}
