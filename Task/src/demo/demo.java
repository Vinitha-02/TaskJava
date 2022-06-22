package demo;

import java.util.Scanner;

public class demo {
	public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter the EmployeeType");
	String  EmployeeType = sc.nextLine();
	
	Employee a;
	  
	  if ("Permanent".equalsIgnoreCase(EmployeeType)){
	
	  a= new PermanentEmployee("Vinitha", "P1", 500.00);
	  a.CalculateSalary();
	  }
	
	  else if("PartTime".equalsIgnoreCase(EmployeeType)) {
	  a = new PartTimeEmployee("Shruthi", "PT1", 500.00,3);
	  a.CalculateSalary();
	}  
	   
	
	  else 	if("Contract".equalsIgnoreCase(EmployeeType)) {
	  a= new ContractEmployee("Vishali","C1", 500.00, 6);
	  a.CalculateSalary();
	  }
	
	else {
		System.out.println("Enter the correct EmployeeType");
	}
}}

