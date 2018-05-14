//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.util.Map;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.JTextField;
//import javax.swing.table.DefaultTableModel;
//
//public class JTableRow   {
//
//    public static void main(String[] args){
//        
//        // create JFrame and JTable
//        JFrame frame = new JFrame();
//        JTable table1 = new JTable(); 
//        // create a table model and set a Column Identifiers to this model 
//        Object[] columns = {"Id","Name","Address"};
//        DefaultTableModel model = new DefaultTableModel();
//        model.setColumnIdentifiers(columns);
//        table3.setModel(model);
//        // Change A JTable Background Color, Font Size, Font Color, Row Height
//        table3.setBackground(Color.LIGHT_GRAY);
//        table3.setForeground(Color.black);
//        Font font = new Font("",1,22);
//        table3.setFont(font);
//        table3.setRowHeight(30);
//        // create JScrollPane
//        JScrollPane pane = new JScrollPane(table1);
//        pane.setBounds(100, 150, 880, 200);
//        Object[] row = new Object[3];
//        btnAdd.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            	for (int i = 0; i < 3; i++) {
//            		row[0] = "0";//m.getValue().getEID();
//            		row[1] = "1";//m.getValue().getUserName();
//            		row[2] = "2";// m.getValue().getUserAddress();
//            		
//        			//System.out.println(m.getKey() +" : eid = "+m.getValue().getEID()+" e name: "+m.getValue().getUserAddress());
//            		model.addRow(row);
//        		}
//            }
//        });
//    }
//}