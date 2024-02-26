package br.edu.employee.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		add(txtEmployeeLabel, gbc);
		
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(txtEmployeeList, gbc);
		
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.CENTER;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btnNew, gbc);
		
		
		
		setSize(500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
}
