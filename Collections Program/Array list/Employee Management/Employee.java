package employee;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> 
{
	private int empId;
	private String empName;
	private String deptId;
	private double empSal;
	private LocalDate joiningDate; 
	private Address address;
	
	public Employee(int empId, String empName, String deptId, double empSal, LocalDate joiningDate) 
	{
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.empSal = empSal;
		this.joiningDate = joiningDate;
	}
	
	public Employee(int empId)
	{
		this.empId = empId;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder sb=new StringBuilder(" ");
		if(address!=null)
			sb.append(address);
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", empSal=" + empSal
				+ ", joiningDate=" + joiningDate + ", Address Details " + sb + "]";
	}
	
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Employee)
			return empId==((Employee)o).empId;
		return false;
	}
	
	@Override
	public int compareTo(Employee e)
	{
		return ((Integer)empId).compareTo((Integer)e.empId);
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

	public LocalDate getJoiningDate() 
	{
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) 
	{
		this.joiningDate = joiningDate;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(String street, String city, int pinCode) 
	{
		this.address = new Address(street, city, pinCode);
	}

	
}
