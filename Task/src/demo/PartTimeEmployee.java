package demo;

public class PartTimeEmployee extends Employee {
Double TotalSalary;
	
   private int hours;


public PartTimeEmployee (String employeeName, String employeeID , double BaseSalary, int h )
{   super(employeeName,employeeID,BaseSalary );
   hours =h;
  
 
}

public void CalculateSalary()
{   
    TotalSalary = 30*hours*(BaseSalary/24)*12;
    System.out.println("EmployeeName:"  + employeeName +" EmployeeID:" + employeeID + " Annual Salary:" +  TotalSalary);

}

	
	

}



