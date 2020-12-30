/*
Create Student management app for the following
Store student details in a suitable data structure , ensuring constant time performance + powerful methods for CRUD operations.


2. Student Admission
No duplicate admission pls. 
PRN : unique
API : containsKey + put 
OR
putIfAbsent : null or not null

3. Fetch Student Details
I/P : PRN 
O/P student details or error mesg
API : get

4. Display all student details
no inputs
API : toString 

5. Update marks of a particular student.
I/P : PRN & new marks
API : get , in case of valid PRN  : setMarks

6. Cancel Admission
I/P : PRN 
API : remove --> rets null : throw exc or otherwise print the details of the removed student
*/

package tester;

import java.util.HashMap;
import java.util.Scanner;

import student.Course;
import student.Student;

import static java.time.LocalDate.parse;
import static student.Course.valueOf;

public class StudentManagement
{
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			HashMap<String , Student> students = new HashMap<>();//<> it indicate consider from left side
			while(!exit)
			{
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println("Option: "
						+ "\n1.Student Admission."
						+ "\n2.Fetch Student Details."
						+ "\n3.Display all student details."
						+ "\n4.Update marks of a particular student."
						+ "\n5.Cancel Admission."
						+ "\n6.Quit.");
				switch(sc.nextInt())
				{
//						2. Student Admission
//						No duplicate admission pls. 
//						PRN : unique
//						API : containsKey + put 
//						OR
//						putIfAbsent : null or not null
					case 1 : 
							System.out.println("Enter student studentId, course, name, marks, birthDate");
							String studentId=sc.next();
							System.out.println(students.put(studentId, new Student(studentId, valueOf(sc.next().toUpperCase()), sc.next(), sc.nextDouble(), parse(sc.next()))));
							break;
						
//							3. Fetch Student Details
//							I/P : PRN 
//							O/P student details or error mesg
//							API : get
					case 2 :
							System.out.println("Enter StudentId for fetching details");
							Student s=students.get(sc.next());
							if(s!=null)
								System.out.println(s);
							break;
					case 3 :
							System.out.println(students);
							break;
							
					case 4 :
							System.out.println("Enter StudentId for update marks");
							s=students.get(sc.next());
							if(s!=null)
							{
								s.setMarks(sc.nextDouble());
								System.out.println("After updation : "+s);
							}
							break;
							
					case 5 :
							System.out.println("Enter StudentId Cancel Application..");
							students.remove(sc.next());
							break;
													
					case 6 :
							exit=true;
							break;
				}
			}
		}
	}
}
/*
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
1
Enter student studentId, course, name, marks, birthDate
EDAC101 DEVOPS Samadhan 75.97 1997-02-19
null
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
1
Enter student studentId, course, name, marks, birthDate
EDAC102 DBT Vinod 79.97 1995-02-19
null
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
1
Enter student studentId, course, name, marks, birthDate
EDAC103 WT Rohit 85.97 1993-12-10
null
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
2
Enter StudentId for fetching details
101
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
2
Enter StudentId for fetching details
EDAC101
Student [studentId=EDAC101, course=DEVOPS, name=Samadhan, marks=75.97, birthDate=1997-02-19]
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
3
{EDAC102=Student [studentId=EDAC102, course=DBT, name=Vinod, marks=79.97, birthDate=1995-02-19],
EDAC103=Student [studentId=EDAC103, course=WT, name=Rohit, marks=85.97, birthDate=1993-12-10],
EDAC101=Student [studentId=EDAC101, course=DEVOPS, name=Samadhan, marks=75.97, birthDate=1997-02-19]}
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
4
Enter StudentId for update marks
EDAC101 80.75
After updation : Student [studentId=EDAC101, course=DEVOPS, name=Samadhan, marks=80.75, birthDate=1997-02-19]
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
1
Enter student studentId, course, name, marks, birthDate
EDAC101 DEVOPS Samadhan 75.97 1997-02-19
Student [studentId=EDAC101, course=DEVOPS, name=Samadhan, marks=80.75, birthDate=1997-02-19]
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
2
Enter StudentId for fetching details
EDAC101
Student [studentId=EDAC101, course=DEVOPS, name=Samadhan, marks=75.97, birthDate=1997-02-19]
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
5
Enter StudentId Cancel Application..
EDAC102
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
3
{EDAC103=Student [studentId=EDAC103, course=WT, name=Rohit, marks=85.97, birthDate=1993-12-10], EDAC101=Student [studentId=EDAC101, course=DEVOPS, name=Samadhan, marks=75.97, birthDate=1997-02-19]}
-------------------------------------------------------------------------------
Option: 
1.Student Admission.
2.Fetch Student Details.
3.Display all student details.
4.Update marks of a particular student.
5.Cancel Admission.
6.Quit.
*/
