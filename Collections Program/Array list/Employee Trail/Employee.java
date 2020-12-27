package employee.employee;

public class Employee
{
	private int empId;
	private String empName;
	private double empSal;
	private String empDesignation;
	
	public Employee(int empId, String empName, double empSal, String empDesignation)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		this.empDesignation=empDesignation;		
	}

	public int getEmpId() 
	{
		return empId;
	}

	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}

	public double getEmpSal() 
	{
		return empSal;
	}

	public void setEmpSal(double empSal) 
	{
		this.empSal = empSal;
	}

	public String getEmpDesignation()
	{
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation)
	{
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDesignation="
				+ empDesignation + "]";
	}
	
	
}
