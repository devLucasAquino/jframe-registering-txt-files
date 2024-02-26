package br.edu.employee.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MainForm extends JFrame {
	
	private JLabel txtEmployeeLabel = new JLabel("Employee list");
	private JTextArea txtEmployeeList = new JTextArea();
	private JButton btnNew = new JButton("new");
	
	public MainForm() {
		toStart();
	}
	
	public void toStart() {
				
		btnNew.setBounds(100, 300, 70, 20);
		txtEmployeeLabel.setBounds(100, 20, 100, 20);
		
		
		getContentPane().add(btnNew);
		getContentPane().add(txtEmployeeLabel);
		getContentPane().add(txtEmployeeList);
		setSize(500, 350);
		setVisible(true);
		
	}
}
