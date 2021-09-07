import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration {

    public Attack a;

    public Registration(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(layout);
        panel.setBorder(BorderFactory.createEmptyBorder(10,5,10,5));

        String[] severityStrings = {"low","medium","high","very high"};
        String[] likelihoodStrings = {"low","medium","high"};
        String[] skillsString = {"none", "low","medium", "high"};
        String[] riskStrings = {"none","low","medium","high"};

        //attack name
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel labelName = new JLabel("Attack name: ");
        panel.add(labelName,gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 100;
        //gbc.gridwidth = 3;
        JTextField textName = new JTextField();
        panel.add(textName,gbc);

        //likelihood_of_attack
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel labelLikelihood  = new JLabel("Likelihood of attack: ");
        panel.add(labelLikelihood ,gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 100;
        JComboBox likelihood = new JComboBox(likelihoodStrings);
        panel.add(likelihood,gbc);

        //typical_severity
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel labelSeverity = new JLabel("Severity: ");
        panel.add(labelSeverity,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 100;
        JComboBox typical_severity = new JComboBox(severityStrings);
        panel.add(typical_severity,gbc);

        //skills_required
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel labelScope = new JLabel("Skills required: ");
        panel.add(labelScope,gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 100;
        JComboBox comboSkills = new JComboBox(skillsString);
        panel.add(comboSkills,gbc);


        //prerequisites
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 5;
        JLabel labelImpact = new JLabel("prerequisites:");
        panel.add(labelImpact,gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.ipadx = 100;
        JComboBox comboPrerequisites = new JComboBox(likelihoodStrings);
        panel.add(comboPrerequisites,gbc);


        //mitigations
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 9;
        JLabel labelMitigation = new JLabel("Mitigations: ");
        panel.add(labelMitigation,gbc);
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.ipadx = 100;
        gbc.gridwidth = 3;
        JTextField textMitigaiton = new JTextField();
        panel.add(textMitigaiton,gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 10;
        JLabel prazna = new JLabel(" ");
        panel.add(prazna,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 10;
        JLabel prazna2 = new JLabel(" ");
        panel.add(prazna2,gbc);


        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 11;
        //gbc.gridwidth = 2;
        JButton calculate = new JButton("Register");
        panel.add(calculate,gbc);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textName.getText().length()==0){
                    JOptionPane.showMessageDialog(frame,
                            "Attack name can't be empty.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                }
                if(textMitigaiton.getText().length()==0){
                    JOptionPane.showMessageDialog(frame,
                            "Attack mitigation can't be empty.",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                }
                if(textName.getText().length()!=0 && textMitigaiton.getText().length()!=0){

                    System.out.println("da l uzme ovaj napad u registration");

                    Attack attack = new Attack(textName.getText(),
                            likelihood.getSelectedItem().toString(),
                            textMitigaiton.getText(),
                            comboPrerequisites.getSelectedItem().toString(),
                            comboSkills.getSelectedItem().toString(),
                            typical_severity.getSelectedItem().toString()
                            );
                    System.out.println("da l dodje ovde u registration");
                    RemoteDatabase.insertQuery(attack);
                    a=attack;

                    JOptionPane.showMessageDialog(frame,
                            "Attack successfully registered.",
                            "Success message",
                            JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose();
                }
            }
        });

        frame.setContentPane(panel);
        frame.setPreferredSize(new Dimension(400, 600));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Register attack");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public Attack getAtt(Attack a) {
    	return a;
    }

	public Attack getA() {
		return a;
	}

	public void setA(Attack a) {
		this.a = a;
	}

}
