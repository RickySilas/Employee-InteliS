package com.intellisoft.employeeMgt.DAO;

import com.intellisoft.employeeMgt.EmployeeAddress;

public class EmployeeAddressDAO {
	
	public void addEmployeeAddress(EmployeeAddress employeeAddress) {
		System.out.println("Employee added successfully" + employeeAddress.toString());	
	}
	
	public void deleteEmployeeAddress(int employeeAddressId) {
		System.out.println("Employee Address deleted successfuly, id"+ employeeAddressId);
	}
	
	public void updateEmployeeAddress(int employeeId) {
		System.out.println("Employee address updated successfully, id" + employeeId);
	}
	
	public void listEmployeeAddress() {
		System.out.println("Employee Addresss successfully listed");
	}

}
