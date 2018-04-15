package com.intellisoft.employeeMgt.DAO;

import com.intellisoft.employeeMgt.EmployeeContract;

public class EmployeeContractDAO {
	
	public void addEmployeeContract(EmployeeContract employeeContract) {
		System.out.println("Employee contract added successfully" + employeeContract.toString());	
	}
	
	public void deleteEmployeeContract(int employeeContractId) {
		System.out.println("Employee Contract deleted successfuly, id"+ employeeContractId);
	}
	
	public void updateEmployeeContract(int employeeContractId) {
		System.out.println("Employee Contract updated successfully, id" + employeeContractId);
	}
	
	public void listEmployeeContract() {
		System.out.println("Employee Contract successfully listed");
	}

}
