package tester;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import employee.Employee;
import employee_comparator.EmployeeJoiningDateComparator;
import employee_exception.EmployeeHandlingException;
import utils.ValidationEmployee;

import static utils.ValidationEmployee.*;

public class EmployeeMangament 
{

	public static void main(String[] args) 
	{
		try(Scanner sc= new Scanner(System.in))
		{
			ArrayList<Employee> employees= new ArrayList<>();
			
			/*
			Hire Emp 2. Display All 3. Link Adhar Card 4. Find By Date"
			+ "5 : Sort emps as per asc order of emp id " + "6. Sort emps as per asc order join date "
			+ "7. Sort emps as per asc order join date n salary
			*/
			boolean exit=false;
			try
			{
				while(!exit)
				{
					System.out.println("---------------------------------------------------------------------------------------------------------------");	
					System.out.println("Options::"
							+ "\n 1. Hire Employee."
							+ "\n 2. Display All employee."
							+ "\n 3. Link address."
							+ "\n 4. Find by date"
							+ "\n 5. Sort employee as per asc order of empId"
							+ "\n 6. Sort employee as per asc order of join date"
							+ "\n 7. Sort employee as per asc order join date and salary"
							+ "\n 10.Exit");
					switch (sc.nextInt())
					{
						case 1 :
								System.out.println("---------------------------------------------------------------------------------------------------------------");
								System.out.println("Enter details like: empId, name, deptId, salary, joining date, ");
								employees.add(new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), parse(sc.next())));
							break;
								
						case 2 :					
								System.out.println("---------------------------------------------------------------------------------------------------------------");	
								System.out.println("All Employee details::");
								for (Employee employee : employees)
									System.out.println(employee);						
							break;
							
							//Linking address with employee account.
						case 3 : 
								System.out.println("---------------------------------------------------------------------------------------------------------------");
								System.out.println("Enter empId..");
								System.out.println("Enter address : street, city, pinCode");
								employees.get(validateEmpIdForAddAddress(employees, sc.nextInt())).setAddress(sc.next(), sc.next(), sc.nextInt());
							break;
							
							//Employee names which employee are joined after specific date.
						case 4 : 
								System.out.println("---------------------------------------------------------------------------------------------------------------");
								System.out.println("Enter date : yyyy-mm-dd");
								ValidationEmployee.validateNameAfterDate(employees,sc.next());									
								break;
							
						case 5  : 
								System.out.println("---------------------------------------------------------------------------------------------------------------");	
								System.out.println("Sorting employee as per asc order of empId");
								Collections.sort(employees);							
								break;
							
						case 6  :
								System.out.println("---------------------------------------------------------------------------------------------------------------");	
								System.out.println("Sorting employee as per asc order of join date");
								Collections.sort(employees, new EmployeeJoiningDateComparator());							
								break;
							
						case 7  : 
								System.out.println("---------------------------------------------------------------------------------------------------------------");	
								System.out.println("Sorting employee as per asc order join date and salary");
								//ArrayList<Employee > employees2=(ArrayList<Employee>)employees.clone();
								employees=sortEmployeeJoindateSal(employees);
								break;
							
						case 10 :
								System.out.println("Terminating app !!");
								exit=true;
								break;
							
	
					default:
						break;
					}
				}
			}
			catch (EmployeeHandlingException e) 
			{
				e.printStackTrace();
			}
			sc.nextLine();
		}
	}
}

/*

*/