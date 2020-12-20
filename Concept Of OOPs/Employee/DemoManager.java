package com.app.org;
public class DemoManager extends DemoEmployee 
{
	
	private double perfBonus;

	
	public DemoManager(int empId,  String empName, int deptId,double empSalary, double perfBonus)
	{
		super(empId, deptId, empName, empSalary);
		this.perfBonus = perfBonus;
	}
	public String toString() 
	{
		return "DemoManager ["+super.toString()+"perfBonus=" + this.perfBonus + "Net Salary= "+this.computeNetSalary()+"]";
	}
	public double computeNetSalary()
	{
		return super.getEmpSalary()+this.perfBonus;
	}
	public double getPerfBonus() 
	{
		return perfBonus;
	}
	
}
