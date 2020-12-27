package employee_comparator;

import java.util.Comparator;

import employee.Employee;

public class EmployeeJoiningDateComparator implements Comparator<Employee> 
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{
		return e1.compareTo(e2);
	}

}
