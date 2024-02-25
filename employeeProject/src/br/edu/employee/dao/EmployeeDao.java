package br.edu.employee.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import br.edu.employee.model.Employee;

public class EmployeeDao {
	
	private String databasePath = "C:\\teste\\txt_files\\database.txt";
	
	public EmployeeDao() {
		
	}

	public String getDatabasePath() {
		return databasePath;
	}

	public void setDatabasePath(String databasePath) {
		this.databasePath = databasePath;
	}
	
	public void recordEmployee() {
		try {
			PrintWriter arq = new PrintWriter(
					new FileOutputStream(databasePath, true));
			
			String name = JOptionPane.showInputDialog("Enter employee name: ");
			String office = JOptionPane.showInputDialog("Enter employee office: ");
			double wage = Double.parseDouble(
					JOptionPane.showInputDialog("Enter employee wage: "));
			
			Employee newEmployee = new Employee(name, office, wage);
			
			arq.print(newEmployee);
			arq.close();
			
			JOptionPane.showMessageDialog(null, "Congratulation your code worked!");
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "failed: " +e.getMessage());
			
		}
	}
	
	public void readerEmployee() {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(databasePath));
			
			String line; String show = "";
			try {
				while((line = br.readLine()) != null) {
					show += line + "\n";
				}
				br.close();
				JOptionPane.showMessageDialog(null, show);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "failed: " + e.getMessage());
			}
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "failed: " + e.getMessage());
		}
	}

}
