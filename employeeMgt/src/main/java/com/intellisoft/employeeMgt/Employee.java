package com.intellisoft.employeeMgt;

import java.util.Date;

public class Employee {
	int employeeId;
	String firstName, secondName, lastName;
	Date dateOfBirth;
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getSecondName()
	{
		return secondName;
	}
	
	public void setSecondName(String secondName)
	{
		this.secondName = secondName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	public Employee(int employeeId, String firstName, String secondName, String lastName, Date dateOfBirth) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return firstName +" "+secondName+" "+lastName;
	}
	
}
