package com.intellisoft.employeeMgt.DAO;

import java.util.ArrayList;
import java.util.List;

import com.intellisoft.employeeMgt.ContractType;

public class ContractTypeDAO {
	
	public void addContractType(ContractType contractType) {
		System.out.println("ContractType added successfully" + contractType.toString());	
	}
	
	public void deleteContractType(int contractTypeId) {
		System.out.println("ContractType deleted successfuly, id"+ contractTypeId);
	}
	
	public void updateContractType(int contractTypeId) {
		System.out.println("ContractType updated successfully, id" + contractTypeId);
	}
	
	public List<ContractType> listContractType(){
		List<ContractType> contractTypeList = new ArrayList<ContractType>();
		ContractType ct1 = new ContractType(1,"Fixed", "Fixed description");
		ContractType ct2 = new ContractType(2, "Renewable","yearly");
		ContractType ct3 = new ContractType(3, "Temporary", "Quarterly");
	    contractTypeList.add(ct1);
	    contractTypeList.add(ct2);
	    contractTypeList.add(ct3);
	    System.out.println("Contract Type listed successfully");
	    return contractTypeList;
	}


}
