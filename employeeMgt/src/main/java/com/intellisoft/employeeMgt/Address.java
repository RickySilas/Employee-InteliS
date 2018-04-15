package com.intellisoft.employeeMgt;

public class Address {
	int addressId;
	String description;
	
	public int getAddressId()
	{
		return addressId;
	}
	public void setAddressId(int addressId)
	{
		this.addressId = addressId;
	}
	
	public String getAddressDescription()
	{
		return description;
	}
	
	public void setAddressDescription(String addressDescription)
	{
		this.description= addressDescription;
	}
	
	public Address(int addressId, String description) {
		
		this.addressId = addressId;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Address Id: "+ this.addressId + "description:"+ this.description;
	}
	

}
