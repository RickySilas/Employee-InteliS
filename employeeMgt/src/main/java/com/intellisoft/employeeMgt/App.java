package com.intellisoft.employeeMgt;
import java.util.Date;

import com.intellisoft.employeeMgt.DAO.ContractTypeDAO;
import com.intellisoft.employeeMgt.DAO.EmployeeContractDAO;
import com.intellisoft.employeeMgt.DAO.EmployeeDAO;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	Date dateOfBirth = new Date();
    	Employee employee = new Employee(1, "Test","Test","Test", dateOfBirth );
    	EmployeeDAO e = new EmployeeDAO();
    	e.addEmployee(employee);
    	e.updateEmployee(1);
    	e.listEmployee();
    	e.deleteEmployee(1);
    	
    	ContractType ct = new ContractType(1,"Pensionable", "Pensionabledescription");
    	ContractTypeDAO ctd = new ContractTypeDAO();
    	ctd.addContractType(ct);
    	ctd.updateContractType(1);
    	ctd.deleteContractType(1);
    	ctd.listContractType();
    	
    	EmployeeContract c =  new EmployeeContract(1, 1, dateOfBirth, dateOfBirth);
    	EmployeeContractDAO ecd = new EmployeeContractDAO();
    	ecd.addEmployeeContract(c);
    	ecd.updateEmployeeContract(1);
    	ecd.deleteEmployeeContract(1);
    	ecd.listEmployeeContract();
    }
}
