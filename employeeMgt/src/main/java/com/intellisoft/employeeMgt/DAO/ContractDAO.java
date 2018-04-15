package com.intellisoft.employeeMgt.DAO;

import java.util.ArrayList;
import java.util.List;

import com.intellisoft.employeeMgt.Contract;

public class ContractDAO {
	
	public void addContract(Contract contract) {
		System.out.println("Contract added successfully" + contract.toString());	
	}
	
	public void deleteContract(int contractId) {
		System.out.println("Contract deleted successfuly, id"+ contractId);
	}
	
	public void updateContract(int contractId) {
		System.out.println("Contract updated successfully, id" + contractId);
	}
	
	public List<Contract> listContract(){
		List<Contract> contractList = new ArrayList<Contract>();
		Contract c1 = new Contract(1,"Fixed");
		Contract c2 = new Contract(2, "Renewable");
		Contract c3 = new Contract(3, "Temporary");
	    contractList.add(c1);
	    contractList.add(c2);
	    contractList.add(c3);
	    System.out.println("Contract listed successfully");
	    return contractList;
	}

}
