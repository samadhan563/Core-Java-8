package employee.tester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import employee.employee.Employee;
import employee.utils.EmployeeValidation;

public class EmployeeManagementUsingArrayList 
{

	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			try
			{
				boolean exit=false;
				ArrayList<Employee> empList = new ArrayList<>();
				while(!exit)
				{
					System.out.println("Select Option "
							+ "\n 1.Add Employee."
							+ "\n 2.Delete Employee."
							+ "\n 3.Update Employee."
							+ "\n 4.Display Specific Employee "
							+ "\n 5.Display all Employee"
							+ "\n 6.Exit");
					switch (sc.nextInt())
					{
						case 1 :
								System.out.println("Enter emp Id, emp Name, emp Sal and emp Designation ::");
								empList.add(EmployeeValidation.addEmp(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next()));
							break;
							
						case 2 :
								System.out.println("Enter empId.");
								empList.remove(EmployeeValidation.indexOfCust(empList,sc.nextInt()));
								break;
								
						case 3 :
								System.out.println("Enter empId.");
								Employee employee=EmployeeValidation.indexOfCust(empList, sc.nextInt());
								int index=empList.indexOf(employee);
								employee=EmployeeValidation.update(employee);
								empList.set(index, employee);
								break;
								
						case 4 :
								System.out.println("Enter empId.");
								EmployeeValidation.displayCust(empList,sc.nextInt());
								break;				
							
						case 5:
								System.out.println("All Employee details:");
								Iterator<Employee> itr=empList.iterator();
								while(itr.hasNext())
									System.out.println(itr.next().toString());
								break;
							
						case 6: System.out.println("Terminating app !!!! ");
								exit=true;
						
						default:
							System.out.println("Wrong Option:");
							break;
					}
				}
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				System.out.println(e.getMessage());
			
			}
		}
	}

}
