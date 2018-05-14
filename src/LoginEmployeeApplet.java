//sp second page after login 
//https://www.youtube.com/watch?v=sAReaaTxNGU
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
	
public class LoginEmployeeApplet extends JApplet implements ActionListener {
	public int add(int x, int y) {
		return x+y;
	}
	
int flag1=0;
JScrollPane pane;
	public LoginEmployeeApplet() {
	}
	HashMap<Integer, Employee> hmEmpl = new HashMap<Integer,Employee>();
	Employee objEmp = null;
	int wrongpassword=0;
	String temp="";
	String flag="";
	double r=0.0;
	JPanel mp,fp,sp,tp,forthP;
	JButton bsin,bsign;
	JButton bfplogin;
	TextField tfpuser,t2,tfppass;
	JLabel l1;
	CardLayout c1;
	JTextField tspmain,tspbuffer;
	Label luser,lpass;
	JPanel p1;
	String username="1";
	String password="1";
	Graphics g;
	//for second jpanel
	JButton btnAddEmployee2, btnSearchEmployee2,btnReset2,btnAddCustomer2,btnUpdateCustomer2;
	JLabel lblUserName2,lblPassword2,lblName2,lblAddress2,lblSex2,lblEducation2,lblMesssage2;
	JTextField txtUserName2,txtName2,txtAddress2;
	JPasswordField txtPassword2;
	CheckboxGroup ckBoxSex;
	Checkbox ckBoxMale;
	Checkbox ckBoxFemale;
	Choice EducationChoice;
	
	JButton btnAdd3;
	JButton btnSearch3;
	JLabel lblMes3;
	JTextField txtSearch3;
	JTable table3;
	JButton btnReset3;
	JButton btnEdit3;
	JButton btnDelete3;
	JButton btnGo3;
	 
	 public void init() {
		Color ligthGrayNew = new Color( 211,211,211);
		
		this.setSize(720, 700);
		luser= new Label("Username");
		lpass=new Label("Password");
		tfpuser=new TextField(20);
		tfppass=new TextField(20);
		bfplogin =new  JButton("Login");
		mp=new JPanel();
		fp=new JPanel();
		tp = new JPanel();
		forthP = new JPanel();
		fp.setBackground(new Color(202, 255, 128));
		sp=new JPanel();
		tfpuser=new  TextField(20);
		t2 =new TextField("0");
		c1=new CardLayout();
		sp.setLayout(null);
		t2.setBounds(5,95,390,30);
		bsign=new JButton("Sign in");
		tfppass=new TextField(20);
		getContentPane().add(mp);
		//set card layout on the main panel
		mp.setLayout(c1);
		//add  the first panel fp and the second panel sp to the main panel
		mp.add("first",fp);
		mp.add("second",sp);
		mp.add("third", tp);
		mp.add("forth",forthP);
		//second  panel controls
		EducationChoice=new Choice();
		btnAddEmployee2 = new JButton("Add");
		btnSearchEmployee2 = new JButton("Search");
		btnReset2 = new JButton("Reset");
		btnAddCustomer2 = new JButton("Add Customer");
		btnUpdateCustomer2 = new JButton("Update Customer");
		lblUserName2 = new JLabel("User Name");
		lblPassword2 = new JLabel("Password");
		txtPassword2 = new JPasswordField(10);
		lblName2 = new JLabel("Name");
		lblAddress2 = new JLabel("Address");
		lblSex2 = new JLabel("Sex");
		lblEducation2 = new JLabel("Education");
		lblMesssage2 = new JLabel("TempMessage");
		txtUserName2 = new JTextField(10); 
		txtName2 = new JTextField(10); 
		txtAddress2 = new JTextField(10);
  		
  		ckBoxSex = new CheckboxGroup();
		ckBoxMale = new Checkbox("Male", true,ckBoxSex);
		ckBoxFemale = new Checkbox("Female", false, ckBoxSex);
		//third pannel
		tp.setBackground(Color.WHITE);
		btnAdd3 = new JButton("ADD");
		btnAdd3.setBounds(42, 30, 86, 25);
		btnAdd3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.next(mp);
				c1.next(mp);
			}
		});
		tp.setLayout(null);
		tp.add(btnAdd3);
		
		btnSearch3 = new JButton("search");
		btnSearch3.setBounds(601, 30, 107, 25);
		tp.add(btnSearch3);
		
		lblMes3 = new JLabel("=============================================");
		lblMes3.setBounds(164, 90, 405, 16);
		tp.add(lblMes3);
		
		txtSearch3 = new JTextField();
		txtSearch3.setText("ID please");
		txtSearch3.setBounds(85, 119, 279, 22);
		tp.add(txtSearch3);
		txtSearch3.setColumns(10);
		
		btnGo3 = new JButton("Go");
		btnGo3.setBounds(467, 119, 97, 25);
		tp.add(btnGo3);
		
		table3 = new JTable();
		table3.setBackground(SystemColor.inactiveCaptionBorder);
		tp.add(table3);
		
		btnReset3 = new JButton("Reset");
		btnReset3.setBounds(86, 447, 97, 25);
		tp.add(btnReset3);
		
		btnEdit3 = new JButton("Edit");
		btnEdit3.setBounds(267, 447, 97, 25);
		tp.add(btnEdit3);
		
		btnDelete3 = new JButton("Delete");
		btnDelete3.setBounds(483, 447, 97, 25);
		tp.add(btnDelete3);
		
		btnAddEmployee2.setForeground(Color.BLACK);
		btnAddEmployee2.setBackground(ligthGrayNew);
		btnAddEmployee2.setBounds(20,50,100,50);

		fp.add(luser);
		fp.add(tfpuser);
		fp.add(lpass);
		fp.add(tfppass);
		fp.add(bfplogin);
		tfppass.setEchoChar('Ø');
		
		EducationChoice.add("Bachelors");
  		EducationChoice.add("Masters");
  		EducationChoice.add("PhD");
  	
		sp.setBackground(new Color (144, 144, 144));
		sp.add(lblMesssage2);
		sp.add(btnAddEmployee2);
		sp.add(btnSearchEmployee2);
		sp.add(lblUserName2);
		sp.add(txtUserName2);
		sp.add(lblPassword2);
		sp.add(txtPassword2);
		sp.add(lblName2);
		sp.add(txtName2);
		sp.add(lblAddress2);
		sp.add(txtAddress2);
		sp.add(lblSex2);
		sp.add(ckBoxFemale);
		sp.add(ckBoxMale);
		sp.add(lblEducation2);
		sp.add(EducationChoice);
		sp.add(btnReset2);
		sp.add(btnAddCustomer2);
		sp.add(btnUpdateCustomer2);
		
		fp.setBackground(new Color(128,128,255));
		bfplogin.setBounds(5,50,200,34);
		bfplogin.setBackground(Color.GRAY);
		bfplogin.setForeground(Color.BLACK);
		
		luser.setBackground(new Color(128,128,255));
		lpass.setBackground(new Color(128,128,255));
		//bmem.setHorizontalTextPosition(JButton.CENTER);
		
		btnAddEmployee2.setForeground(Color.BLACK);
		btnAddEmployee2.setBackground(ligthGrayNew);
		btnAddEmployee2.setBounds(20,50,100,50);
		
		btnSearchEmployee2.setForeground(Color.BLACK);
		btnSearchEmployee2.setBackground(ligthGrayNew);
		btnSearchEmployee2.setBounds(600,50,100,50);
		
		lblMesssage2.setText("====================================");
		lblMesssage2.setForeground(Color.BLACK);
		lblMesssage2.setBackground(ligthGrayNew);
		lblMesssage2.setBounds(300,150,600,50);
		
		lblUserName2.setForeground(Color.BLACK);
		lblUserName2.setBackground(ligthGrayNew);
		lblUserName2.setBounds(20,250,100,50);
		
		txtUserName2.setForeground(Color.BLACK);
		txtUserName2.setBackground(ligthGrayNew);
		txtUserName2.setBounds(150,250,100,50);
		
		EducationChoice.setForeground(Color.BLACK);
		EducationChoice.setBackground(ligthGrayNew);
		EducationChoice.setBounds(600,250,100,50);

		lblPassword2.setForeground(Color.BLACK);
		lblPassword2.setBackground(ligthGrayNew);
		lblPassword2.setBounds(20,320,100,50);
		
		txtPassword2.setForeground(Color.BLACK);
		txtPassword2.setBackground(ligthGrayNew);
		txtPassword2.setBounds(150,320,100,50);
	
		lblName2.setForeground(Color.BLACK);
		lblName2.setBackground(ligthGrayNew);
		lblName2.setBounds(20,390,100,50);
		
		txtName2.setForeground(Color.BLACK);
		txtName2.setBackground(ligthGrayNew);
		txtName2.setBounds(150,390,100,50);

		lblAddress2.setForeground(Color.BLACK);
		lblAddress2.setBackground(ligthGrayNew);
		lblAddress2.setBounds(20,460,100,50);
		
		txtAddress2.setForeground(Color.BLACK);
		txtAddress2.setBackground(ligthGrayNew);
		txtAddress2.setBounds(150,460,100,50);

		lblSex2.setForeground(Color.BLACK);
		lblSex2.setBackground(ligthGrayNew);
		lblSex2.setBounds(20,530,100,50);
		
		ckBoxMale.setForeground(Color.BLACK);
		ckBoxMale.setBackground(ligthGrayNew);
		ckBoxMale.setBounds(150,530,50,50);
		
		ckBoxFemale.setForeground(Color.BLACK);
		ckBoxFemale.setBackground(ligthGrayNew);
		ckBoxFemale.setBounds(210,530,70,50);
		
		btnReset2.setForeground(Color.BLACK);
		btnReset2.setBackground(ligthGrayNew);
		btnReset2.setBounds(390,600,100,50);
		
		btnAddCustomer2.setForeground(Color.BLACK);
		btnAddCustomer2.setBackground(ligthGrayNew);
		btnAddCustomer2.setBounds(510,600,150,50);
		
		bfplogin.addActionListener(this);
		btnAddEmployee2.addActionListener(this);
		btnReset2.addActionListener(this);
		btnSearchEmployee2.addActionListener(this);
		
		btnAddCustomer2.addActionListener(this);
		btnGo3.addActionListener(this);
		btnReset3.addActionListener(this);
		btnDelete3.addActionListener(this);
	}//init
	public void createTable() {

		String[] columnNames= {"id","Name","Address"};
		Object[][] data = new Object[hmEmpl.size()][3];
		int i=0,j=0;
		for(Map.Entry<Integer, Employee> m :hmEmpl.entrySet()) {
			//System.out.println(m.getKey() +" : eid = "+m.getValue().getEID()+" e name: "+m.getValue().getUserAddress());
			data[i][j++] =m.getValue().getEID();
			data[i][j++] =m.getValue().getUserName();
			data[i][j++] =m.getValue().getUserAddress();
			i++;j=0;
		}
			table3=new JTable(data,columnNames);
			pane = new JScrollPane(table3);
			System.out.println("===========");
			if(flag1 == 0) {
				flag1=1;
				pane.setBounds(86, 216, 500, 200);
				tp.add(this.pane);
			}
			else
			{
				pane.setBounds(1, 216, 500, 200);
				tp.add(this.pane);
			}
	}//create table
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj2=ae.getSource();
		if(obj2==bfplogin)
		{
			//username and password correct & wrongpassword<3
			if(username.equals(tfpuser.getText())){
				if(password.equals(tfppass.getText())){
					if(wrongpassword!=3){
						System.out.println("you may log in");
						c1.next(mp);
					}
				}
			}
			else if(wrongpassword< 3) {//username or passwd wrong but  wrongpassword <3
				if(!(password.equals(tfppass.getText())) | (!(username.equals(tfpuser.getText())))){
					wrongpassword=wrongpassword+1;
					System.out.println("wrong username or password , Attemptt no :  "+wrongpassword +" Out Of Possible 3 Attempts");
					System.out.println("wrong user name or passoword");
					System.out.println("entered password is  :"+tfppass.getText());
					System.out.println("entered username is  :"+tfpuser.getText());
					tfpuser.setText(""); // clear the user text field to relogin
					tfppass.setText("");// clear the password text field to relogin
					System.out.println("tfpuser is : "+tfpuser.isEnabled());
					tfpuser.setEnabled(true);
				}
			}
			if((wrongpassword==3) | (wrongpassword>3)){//3 wrong log in attempts
				System.out.println("too many bad attempts" +wrongpassword);
				System.out.println("EXITING");
				try{
					//exit();
					System.exit(0);
				}
				catch(Exception exp1){
					JOptionPane.showMessageDialog(null,"can't exit using this button" +exp1);
				}
			}
		}//end of final if for passwords
		//reset2 - start
		else if(obj2 == btnReset2){
			resetPanel2();
		}//reset2 - end
		else if(obj2 == btnAddEmployee2 ) {
			c1.show(mp, "fp");
			resetPanel2();
			lblMesssage2.setText("Please enter these details!!");
			
		}else if( obj2 == btnSearchEmployee2) {
			c1.show(mp,"third");
			createTable();
    			//System.out.println(m.getKey() +" : eid = "+m.getValue().getEID()+" e name: "+m.getValue().getUserAddress());
		}else if( obj2 ==btnGo3) {
			try{
				int searchID = Integer.parseInt(txtSearch3.getText());
	            // checking valid integer using parseInt() method
				if( txtSearch3.getText().isEmpty()) {
    				lblMes3.setText("enter ID");
    			}else
    			 if( hmEmpl.containsKey(searchID)) {
    				lblMes3.setText("Found!!!");
	    			String[] columnNames= {"id","Name","Address"};
	    			Object[][] data = new Object[1][3];
	    			data[0][0] = hmEmpl.get(searchID).getEID();
	    			data[0][1] = hmEmpl.get(searchID).getUserName();
	    			data[0][2] = hmEmpl.get(searchID).getUserAddress();
	    				
	    			table3=new JTable(data,columnNames);
	    			pane = new JScrollPane(table3);
					pane.setBounds(86, 216, 500, 200);
					tp.add(this.pane);
    			}else if (!txtSearch3.getText().isEmpty()) {
    				lblMes3.setText("Enter from 100 ");
    			}
	        } 
	        catch (NumberFormatException e) {
	        	lblMes3.setText("Must b number, try 100 ");
	        }
		}//btn go 3
		else if( obj2 ==btnSearch3) {
			c1.next(mp);
		}//btnsearch3
		else if(obj2 == btnReset3) {
			reset3();
		}
		else if( obj2 == btnAddCustomer2) {
			String userNameScanned = txtUserName2.getText();
			String passwordScanned = txtPassword2.getText();
			String empNameScanned =  txtName2.getText();
			String addressScanned = txtAddress2.getText();
			String sexScanned = ckBoxSex.getSelectedCheckbox().getLabel();
			String educationScanned = EducationChoice.getSelectedItem();
			AddCustomerBtn(userNameScanned,passwordScanned,empNameScanned,addressScanned,sexScanned,educationScanned);
			resetPanel2();
			lblMesssage2.setText("Successfuly added: "+ userNameScanned);
		}
		else if( obj2 == btnDelete3) {
			try {
			int selectRow = table3.getSelectedRow();
			int cellValue = (int) table3.getModel().getValueAt(selectRow, 0);
			lblMes3.setText("Deleteing row : "+selectRow+" cell value : "+ cellValue);
			 if(hmEmpl.containsKey(cellValue)) {
				 hmEmpl.remove(cellValue);
				 lblMes3.setText("Deleted "+ cellValue);
				}else {
					lblMes3.setText("Not Deleted "+ cellValue);
				}
			} 
			catch (Exception e){
				lblMes3.setText("Please select a row form table");
			}
			
		}//btn delete 3
	}//actionPerformed
	public boolean AddCustomerBtn(String userNameScanned,String passwordScanned,String empNameScanned,String addressScanned,String sexScanned,String educationScanned) {
		if(userNameScanned.length()==0 || passwordScanned.length()==0 || empNameScanned.length()==0 || addressScanned.length()==0) {
			lblMesssage2.setText("Please make sure fields are entered!");
			return false;
		}
		else {
			System.out.println();
			insertEmployee(userNameScanned, passwordScanned, empNameScanned, addressScanned, sexScanned,educationScanned);
			return true;
		}
	}
	private void reset3() {
		DefaultTableModel dataModel = new DefaultTableModel();
	 	table3.setModel(dataModel);
	 	dataModel.setRowCount(0);
	}//resetbtn3
	private void insertEmployee(String userNameScanned, String passwordScanned, String empNameScanned,
		String addressScanned, String sexScanned, String educationScanned) {
		objEmp = new Employee(userNameScanned, passwordScanned, empNameScanned, addressScanned, sexScanned, educationScanned);
		int id = hmEmpl.size();
		id = id+100;
		objEmp.setEID(id);
		hmEmpl.put(id, objEmp);
//		resetPanel2();
//		lblMesssage2.setText("Successfuly added: "+ userNameScanned);
//		for(Map.Entry<Integer, Employee> m :hmEmpl.entrySet()) {
//			System.out.println(m.getKey() +" : eid = "+m.getValue().getEID()+" e name: "+m.getValue().getUserAddress());
//		}
	}//insertEmployee
	public void resetPanel2() {
		txtUserName2.setText("");
		txtName2.setText("");
		txtAddress2.setText("");
		txtPassword2.setText("");
	}//Override actionPerformed
}//LoginEmployeeApplet
