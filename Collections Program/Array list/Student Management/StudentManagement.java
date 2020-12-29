/*
  	Create suitable UI , for the following
	1. Store Student information in the ArrayList
	2. Accept 4 student details ,n confirm no duplications.
	3. Display all of them using list iterator , in a reverse mannner
	4. Display student details , sorted as per id (use Natural ordering)
	5. Display student details , sorted as per birth date n marks (use Custom ordering & anonymous inner class)

*/
package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

import static java.time.LocalDate.parse;
import student.Student;
import student_exception.InvalidCredentialDetails;
import studentvalidation.StudentValidation;

public class StudentManagement 
{
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			ArrayList<Student> students=StudentValidation.record();
			boolean exit=false;
			while(!exit)
			{
				try		
				{
					System.out.println("Choose Option: "
							+ "\n1.Add student."
							+ "\n2.Display all of them using list iterator in a reverse"
							+ "\n3.Display student details , sorted as per id (use Natural ordering"
							+ "\n4.Display student details , sorted as per birth date n marks (use Custom ordering & anonymous inner class"
							+ "\n5.Exit.");
					switch (sc.nextInt())
					{
						case 1: System.out.println("Enter Student details like:students, studentId, studentName, birthDate, courseName& marks");		
							students.add(StudentValidation.addStudent(students, sc.nextInt(), sc.next(), parse(sc.next()), sc.next(), sc.nextDouble()));
							break;	
							
						case 2: ListIterator<Student> listIterator=students.listIterator(students.size());
								while(listIterator.hasPrevious())
									System.out.println(listIterator.previous());
								break;
								
						case 3: Collections.sort(students);
								System.out.println("Sorted Record of Student..........");
								for(Student s : students)
									System.out.println(s);
							break;	
		
						case 4:Collections.sort(students, new Comparator<Student>()
							{
								public int compare(Student s1,Student s2)
								{
									int result=s1.getBirthDate().compareTo(s2.getBirthDate());
									if(result !=0 )
										return result;
									return ((Double)(s1.getMarks())).compareTo(s2.getMarks());
								}
							}); 
							
						System.out.println("Sorted Record of Student..........");
						for(Student s : students)
							System.out.println(s);
						
							
							break;	
						case 5: exit=true;
								break;
		
						default:
							break;
					}
				}
				catch (InvalidCredentialDetails  e)
				{
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}			
		}

	}
}
