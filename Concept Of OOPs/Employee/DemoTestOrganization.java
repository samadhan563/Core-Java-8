/**
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
package tester;

import java.util.Scanner;

import com.app.org.DemoEmployee;
import com.app.org.DemoManager;
import com.app.org.DemoWorker;

public class DemoTestOrganization {
	public static void main(String[] args) {
		int counter = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum Employee::");
		DemoEmployee[] demoEmployee = new DemoEmployee[sc.nextInt()];
		do {
			System.out.println("" + "\n1.Hire Manager" + "\n2.Hire Worker" + "\n3.Display information of all employees"
					 + "\n4.exit");

			switch (sc.nextInt()) {
			case 1:
				if (counter < demoEmployee.length) {
					System.out.println("Enter Details empId,  empName, deptId, empSalary, PerfBouns ");
					demoEmployee[counter++] = new DemoManager(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(),
							sc.nextDouble());
				} else
					System.out.println("Vaccancies Full !!");

				break;

			case 2:
				if (counter < demoEmployee.length) {
					System.out.println("Enter Details empId,  empName, deptId, empSalary, hoursWorked,  hourlyRate ");
					demoEmployee[counter++] = new DemoWorker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(),
							sc.nextDouble(), sc.nextDouble());
				} else
					System.out.println("Vaccancies Full !!");
				break;
			case 3:
				for (DemoEmployee demoEmploye2 : demoEmployee) 
				{
					if(demoEmploye2!=null)
						System.out.println(demoEmploye2);
				}
				break;
			case 4:
				System.out.println("Terminating...Bye !!!");
				flag = true;
				break;

			default:
				System.out.println("Sorry !!!");
				break;
			}
		} while (!flag);
		sc.close();
	}

}

/**
Enter maximum Employee::
100

1.Hire Manager
2.Hire Worker
3.Display information of all employees
4.exit
1
Enter Details empId,  empName, deptId, empSalary, PerfBouns 
102 vinod 333 25000 250

1.Hire Manager
2.Hire Worker
3.Display information of all employees
4.exit
2
Enter Details empId,  empName, deptId, empSalary, hoursWorked,  hourlyRate 
103 Rohit 111 25000 25 250

1.Hire Manager
2.Hire Worker
3.Display information of all employees
4.exit
1
Enter Details empId,  empName, deptId, empSalary, PerfBouns 
104 sama 333 25000 230

1.Hire Manager
2.Hire Worker
3.Display information of all employees
4.exit
3
DemoManager [empId=102, deptId=333, empName=vinodperfBonus=250.0Net Salary= 25250.0]
DemoWorker [empId=103, deptId=111, empName=Rohit hoursWorked=25.0, hourlyRate=250.0 Net Salary= 31250.0]
DemoManager [empId=104, deptId=333, empName=samaperfBonus=230.0Net Salary= 25230.0]

1.Hire Manager
2.Hire Worker
3.Display information of all employees
4.exit
4
Terminating...Bye !!!
 */
