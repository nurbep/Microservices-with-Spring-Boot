package com.example.demo;

public class PersonDetails {
	private Long id;
	private String firstName;
	private String lastName;
	private double monthlyIncome;
	public double getMonthlyIncome() {
		return monthlyIncome;
	}


	private double yearlySalary;
	
	public PersonDetails() {}

	public PersonDetails(Long id, String firstName, String lastName,double monthlyIncome, double yearlySalary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlyIncome=monthlyIncome;
		this.yearlySalary = yearlySalary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	
	

}
