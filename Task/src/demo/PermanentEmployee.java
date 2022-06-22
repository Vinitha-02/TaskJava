package demo;

public class PermanentEmployee extends Employee {
	Double TotalSalary;
	
	public PermanentEmployee(String employeeName, String employeeID, double BaseSalary)
	{
	  super(employeeName,employeeID,BaseSalary);
	  
  
	 }
	public void CalculateSalary()
	{	
	 TotalSalary = 30*12*BaseSalary;
	 System.out.println("EmployeeName:"  + employeeName +" EmployeeID:" + employeeID + " AnnualSalary:" +  TotalSalary);
	}

	
	

}
