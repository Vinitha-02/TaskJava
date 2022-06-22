package demo;

public  abstract class Employee {
	 protected String employeeName;
	    protected String employeeID;
	    protected Double BaseSalary;
	    abstract void CalculateSalary();
			
	        public Employee(String employeeName, String employeeID, double BaseSalary)//default constructor
			{
			 this.employeeName=employeeName;
			 this.employeeID=employeeID;
			  this.BaseSalary=BaseSalary;
			}
	public String getEmployeeName() {
	        return employeeName;
	    }

	public String getEmployeeID() {
	        return employeeID;
	    }
	 public Double getBaseSalary() {
	        return BaseSalary;
	    }
}

