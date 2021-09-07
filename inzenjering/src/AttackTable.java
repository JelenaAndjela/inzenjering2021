import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class AttackTable {


    public AttackTable(List<Attack> attackList){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));



          String[] columnNames = {"Name",
                "Likelihood of attack",
                  "Mitigations",
                  "Prerequisites",
                  "Skills required",
                "Typical severity"
                };


        String[][] data = new String[attackList.size()][columnNames.length];
        for(int i=0; i<attackList.size(); i++){
                data[i]= new String[]
                        {attackList.get(i).name, attackList.get(i).likelihood_of_attack,
                        attackList.get(i).mitigations, attackList.get(i).prerequisites,
                        attackList.get(i).skills_required,
                        attackList.get(i).typical_severity};

        }

        DefaultTableModel dm = new DefaultTableModel();
        dm.setDataVector(data, columnNames);
        JTable table = new JTable(dm);


        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(1200, 600));
        table.getColumnModel().getColumn(0).setPreferredWidth(200);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);

        table.setRowHeight(30);


        panel.add(sp);
        frame.add(panel);
        table.setBounds(30, 40, 200, 300);
        

        frame.setTitle("List of attacks");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }



}
