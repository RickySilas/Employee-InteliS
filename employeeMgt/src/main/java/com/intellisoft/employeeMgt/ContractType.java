package com.intellisoft.employeeMgt;

public class ContractType {
	
	int contractTypeId;
	String contractType;
	String description;
	
	public int getContractTypeId()
	{
		return contractTypeId;
	}
	public void setContractTypeId(int contractTypeId)
	{
		this.contractTypeId = contractTypeId;
	}
	
	public String getContractType()
	{
		return contractType;
	}
	public void setContractType(String contractType)
	{
		this.contractType = contractType;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description= description;
	}
	
public ContractType(int contractTypeId, String contractType, String description) {
		
		this.contractTypeId = contractTypeId;
		this.contractType = contractType;
		this.description = description;
		
	}
@Override
public String toString() {
	return "Contract Type Id: "+ this.contractTypeId + "contractType:"+ this.contractType + "description:"+ this.description;
}
	

}
