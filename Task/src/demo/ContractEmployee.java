package demo;

public class ContractEmployee extends Employee {
	Double TotalSalary;
	private int Months;

	 
	public ContractEmployee(String employeeName, String employeeID, double BaseSalary, int m) {
		 super(employeeName,employeeID,BaseSalary );
			this.Months= m;}
			
	

	public void CalculateSalary()
	{   
	    TotalSalary = 30*Months*BaseSalary;
	    System.out.println("EmployeeName:"  + employeeName +" EmployeeID:" + employeeID + " AnnualSalary:" + TotalSalary );

	}

}
