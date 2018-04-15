package com.intellisoft.employeeMgt;

import java.util.Date;

public class EmployeeContract {
	int employeeContractId;
	int contractTypeId;
	Date dateSigned;
	Date expieryDate;
	int employeeId;
	
	public int getEmployeeContractId()
	{
		return employeeContractId;
	}
	public void setEmployeeContractId(int employeeContractId)
	{
		this.employeeContractId = employeeContractId;
	}
	
	public int getContractTypeId()
	{
		return contractTypeId;
	}
	public void setContractTypeId(int contractTypeId)
	{
		this.contractTypeId = contractTypeId;
	}
	
	public Date getDateSigned()
	{
		return dateSigned;
	}
	
	public void setDateSigned(Date dateSigned)
	{
		this.dateSigned = dateSigned;
	}
	
	public Date getExpieryDate()
	{
		return expieryDate;
	}
	
	public void setExpieryDate(Date expieryDate)
	{
		this.expieryDate = expieryDate;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public EmployeeContract(int employeeContractId, int contractTypeId, Date dateSigned, Date expieryDate) {
		this.employeeContractId = employeeContractId;
		this.contractTypeId = contractTypeId;
		this.dateSigned = dateSigned;
		this.expieryDate = expieryDate;
	}

}
