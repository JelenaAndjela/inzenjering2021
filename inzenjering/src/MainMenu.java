import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class MainMenu  {

	public static JPanel panel;
	public static JFrame frame;
	
	public static ArrayList<String> res=new ArrayList<String>();

	
    public static void main (String[] args){

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");

        } catch(Exception ignored){
            System.out.println("Look and feel error");
        }


        GridLayout gl = new GridLayout(12,0);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(gl);
        panel.setBorder(BorderFactory.createEmptyBorder(80,80,30,80));

        JLabel prazno1 = new JLabel(" ");
        JLabel prazno2 = new JLabel(" ");
        JLabel prazno3 = new JLabel(" ");
        JLabel prazno4 = new JLabel(" ");
        JLabel prazno5 = new JLabel(" ");


        JButton fuzzy = new JButton("Risk calculation(Fuzzy)");
        JButton bayes = new JButton("Classification(Bayes)");
        JButton register = new JButton("Register new attack");
        JButton viewAll = new JButton("View all attacks");
        JButton cbr = new JButton("View similarity");
        JButton  mitigations= new JButton("View mitigations");

        fuzzy.setFont(new Font("Arial", Font.PLAIN, 18));
       panel.add(fuzzy);
        panel.add(prazno1);
        bayes.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(bayes);
        panel.add(prazno2);
        register.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(register);
        panel.add(prazno3);
        viewAll.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(viewAll);
        panel.add(prazno4);
        cbr.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(cbr);
        panel.add(prazno5);
        mitigations.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(mitigations);

        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
     //   frame.setSize(screen.width/4*3, screen.height/4*3);
       frame.setLocation(screen.width/2-frame.getSize().width/2, screen.height/2-frame.getSize().height/2);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Menu");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

		frame.repaint();
		frame.revalidate();
    }
}
