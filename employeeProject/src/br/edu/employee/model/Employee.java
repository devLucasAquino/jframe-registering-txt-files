package br.edu.employee.model;

public class Employee {
	
	private Long id;
	private String name;
	private String office;
	private Double wage;
	
	public Employee(String name, String office, Double wage) {
		this.name = name;
		this.office = office;
		this.wage = wage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}
	
	@Override
	public String toString() {
		return "Name: " +this.name+
			 ", Office: " +this.office+
			 ", Wage: " +this.wage;
	}

}
