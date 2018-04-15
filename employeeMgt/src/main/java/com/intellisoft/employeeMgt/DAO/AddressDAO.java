package com.intellisoft.employeeMgt.DAO;


import java.util.ArrayList;
import java.util.List;

import com.intellisoft.employeeMgt.Address;

public class AddressDAO {
	
	public void addAddress(Address address) {
		System.out.println("Address added successfully" + address.toString());
	}
	
	public void deleteAddress(int addressId) {
		System.out.println("Address deleted successfuly, id"+ addressId);
	}
	
	public void updateAddress(int addressId) {
		System.out.println("Address updated successfully, id" + addressId);
	}
	
	public List<Address> listAddress(){
		List<Address> addressList = new ArrayList<Address>();
		Address a1 = new Address(1,"Kibuye");
		Address a2 = new Address(2, "Kisian");
	    addressList.add(a1);
	    addressList.add(a2);
	    System.out.println("Address listed successfully");
	    return addressList;
	}

}
