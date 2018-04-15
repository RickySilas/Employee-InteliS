package com.intellisoft.employeeMgt;

public class EmployeeAddress {
	int employeeAddressId;
	int employeeId;
	int addressId;
	
	public int getEmployeeAddressId()
	{
		return employeeAddressId;
	}
	public void setEmployeeAddressId(int employeeAddress)
	{
		this.employeeAddressId = employeeAddress;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public int getAddressId()
	{
		return addressId;
	}
	
	public void setAddressId(int addressId)
	{
		this.addressId = addressId;
	}
	
	public EmployeeAddress(int employeeAddressId, int employeeId, int addressId) {
		this.employeeAddressId = employeeAddressId;
		this.employeeId = employeeId;
		this.addressId = addressId;
	}
	@Override
	public String toString() {
		return "Employee Address Id: "+ this.employeeAddressId + "Employee Id:"+ this.employeeId + "Address Id:" + this.addressId;
	}

}
