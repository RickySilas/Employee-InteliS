package com.intellisoft.employeeMgt;

public class Contract {
   int contractId;
   String description;
   
   public int getContractId()
	{
		return contractId;
	}
	
	public void setContractId(int contractId)
	{
		this.contractId = contractId;
}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description= description;
	}
	
	public Contract(int contractId, String description) {
		
		this.contractId = contractId;
		this.description = description;
		}
	@Override
	public String toString() {
		return "Contract Id: "+ this.contractId + "description:"+ this.description;
	}
}
