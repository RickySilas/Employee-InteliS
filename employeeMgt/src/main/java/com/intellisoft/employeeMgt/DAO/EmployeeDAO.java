package com.intellisoft.employeeMgt.DAO;

import com.intellisoft.employeeMgt.Employee;

public class EmployeeDAO {
	
	public void addEmployee(Employee employee) {
		System.out.println("Employee added successfully " + employee.toString());	
	}
	
	public void deleteEmployee(int employeeId) {
		System.out.println("Employee deleted successfuly, id"+ employeeId);
	}
	
	public void updateEmployee(int employeeId) {
		System.out.println("Employeee updated successfully, id" + employeeId);
	}
	
	public void listEmployee() {
		System.out.println("Employee successfully listed");
	}

}
