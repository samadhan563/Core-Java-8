package employee.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import employee.employee.Employee;

public class EmployeeValidation 
{

	public static Employee addEmp(int empId, String empName, double empSal, String empDesignation)
	{
		//validateName(empName);
		return new Employee(empId, empName, empSal, empDesignation);
	}

	private static void validateName(String empName) 
	{
		String regexp="((?=.^[A-Z]))+(?=.*[A-Z])(?=.*[a-z]){3,15}";
		if(empName.matches(regexp))
			System.out.println("Yes");
		System.out.println("No");
	}

	public static Employee indexOfCust(ArrayList<Employee> empList, int empId) 
	{
		for (Employee employee : empList) 
		{
			if(employee.getEmpId()==empId)
				return employee;
		}
		return null;
	}

	public static ArrayList<Employee> updateCust(ArrayList<Employee> empList, int empId) 
	{
		Iterator< Employee> itr=empList.iterator();
		//int i;
		while (itr.hasNext())
		{
			Employee employee = itr.next();
			if(employee.getEmpId()==empId)
			{
				empList.set(empList.indexOf(employee), update(employee));
				break;
			}
		}
		return empList;
	}

	private static Employee update(Employee employee) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Select option:"
					+ "\n 1.EmpId"
					+ "\n 2.Emp Name"
					+ "\n 3.Emp Sal"
					+ "\n 4.Emp Designation");
			switch (sc.nextInt()) 
			{
				case 1 :
						System.out.println("Enter new emp Id");
						employee.setEmpId(sc.nextInt());	
					break;
					
				case 2 :
					System.out.println("Enter new emp Name");
					System.out.println(employee.toString());
					employee.setEmpName(sc.next());	
					System.out.println(employee.toString());
					
				break;
				
				case 3 :
					System.out.println("Enter new emp Sal");
					employee.setEmpSal(sc.nextDouble());	
				break;
				
				case 4 :
					System.out.println("Enter new emp Designation");
					employee.setEmpDesignation(sc.next());
				break;
				
				default:
					break;
			}

		}
		System.out.println("Updated ...");
		return employee;
	}

	public static void displayCust(ArrayList<Employee> empList, int empId) 
	{
		for (Employee employee : empList) 
		{
			if(employee.getEmpId()==empId)
			System.out.println(employee.toString());
		}
		
	}
}
/*
 102 vinod 3500 clerk
 101 sama 2500 manager
 */
