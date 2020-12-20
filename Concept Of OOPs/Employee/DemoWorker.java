package com.app.org;

public class DemoWorker extends DemoEmployee 
{
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	private double hoursWorked;
	private double hourlyRate;
	public DemoWorker(int empId, String empName, int deptId, double empSalary, double hoursWorked, double hourlyRate)
	{
		super(empId, deptId, empName, empSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public String toString() 
	{
		return "DemoWorker ["+ super.toString() +" hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate +" Net Salary= "+this.computeNetSalary()+ "]";
	}
	public double computeNetSalary()
	{
		return super.getEmpSalary()+(this.hoursWorked*this.hourlyRate);
	}
	
	
}
