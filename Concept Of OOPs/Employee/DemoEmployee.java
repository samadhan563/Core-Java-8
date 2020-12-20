/*1. Go through all code samples & memory diagrams.
	Read "readme inheritance " till today's topics covered.
	
	2. Solve this.
	Fresh business scenario to apply inheritance , polymorphism   to emp based organization scenario.
	
	Create Emp based organization structure --- Emp , Mgr , Worker
	All of above classes must be in --com.app.org
	
	2.1 Emp state--- id(int), name, deptId , basicSalary(double)
	Accept all of above in constructor arguments.
	Methods ---1.To  get emp details -- override toString((inherited from Object class)
	2.2. compute net salary ---ret 0
	(eg : public double computeNetSalary(){return 0;})
	
	2.2 Mgr state  ---id,name,basic,deptId , perfBonus
	Add suitable constructor
	Methods ----1. get mgr details :  override toString (inherited from Emp class)
	2. compute net salary (formula: basic+perfBonus) -- override computeNetSalary
	3. get performance bonus. --add a new method to return bonus.(getter)
	
	2.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
	Methods : 
	1. get worker details -- :  override toString. (inherited from Emp class)
	2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
	3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)
	
	Organize classes in inheritance  hierarchy.
	
	Write TestOrganization in "tester" package.
	Create suitable array to store organization details.
	Provide following options
	
	1. Hire Manager
	I/P : all manager details
	
	2. Hire Worker  
	I/P : all worker details
	
	3. Display information of all employees(toString) & display net salary (by invoking computeNetSal), 
	
	4. Exit
	NOTE : Check boundary conditions properly.
*/
package com.app.org;

public class DemoEmployee
{
	
	private int empId;
	private int deptId;
	private String empName;
	private double empSalary;
	
	public DemoEmployee(int empId, int deptId, String empName, double empSalary)
	{
		this.empId = empId;
		this.deptId = deptId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String toString() 
	{
		return "empId=" + empId + ", deptId=" + deptId + ", empName=" + empName ;
	}
	public int getEmpId() 
	{
		return empId;
	}

	public int getDeptId() 
	{
		return deptId;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public double getEmpSalary()
	{
		return empSalary;
	}
	
	public double computeNetSalary()
	{
		return 0;
	}
}
