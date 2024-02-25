package br.edu.employee.controller;

import br.edu.employee.model.Employee;
import javax.swing.JOptionPane;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Lucas", "Desenvolvedor", 2000.0);
		
		JOptionPane.showMessageDialog(null, employee);
	}

}
