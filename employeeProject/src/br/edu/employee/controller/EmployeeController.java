package br.edu.employee.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import br.edu.employee.dao.EmployeeDao;
import br.edu.employee.model.Employee;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDao();
		//record
		dao.recordEmployee();
		
		//reader
		dao.readerEmployee();
	
		
		
	}
	
	
	
	

}
