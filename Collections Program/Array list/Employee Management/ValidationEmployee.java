package utils;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import employee.Employee;
import employee_exception.EmployeeHandlingException;

public class ValidationEmployee 
{

	public static int validateEmpIdForAddAddress(ArrayList<Employee> employees, int empId) throws EmployeeHandlingException 
	{
		Employee e=new Employee(empId);
		int index=employees.indexOf(e);
		if(index==-1)
			throw new EmployeeHandlingException("Address cannot be added : Invalid empId");
		return index;
	}

	public static ArrayList<Employee> sortEmployeeJoindateSal(ArrayList<Employee> employees) 
	{
		Collections.sort(employees, new Comparator<Employee>()
		{
			public int compare(Employee e1, Employee e2)
			{
				int index=e1.getJoiningDate().compareTo(e2.getJoiningDate());
				if(index != 0)
					return index;
				return ((Double)e1.getEmpSal()).compareTo(e2.getEmpSal());
			}
		});
		return employees;	
	}
	public static void validateNameAfterDate(ArrayList<Employee> employees, String date1)
	{
		LocalDate date=parse(date1);
		System.out.println("Names of employee joined after "+date);
		for (Employee employee : employees) 
			if(employee.getJoiningDate().isAfter(date))
				System.out.println(employee.getEmpName());
	}
	

}
