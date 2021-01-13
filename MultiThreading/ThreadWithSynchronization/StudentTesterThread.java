/*
 2. Create a multi threaded application for saving student details in 2 text files(sample data taken from the 
 list of students ) : (in student_gpa.txt : sorted by gpa & in student_dob.txt : sorted by dob) using 2 different
  threads , concurrently!
 */
package tester;
import static utils.StudentCollectionUtils.populateList;

import java.util.List;
import java.util.Scanner;

import com.app.core.Student;

import task_runable.SortByDOB;
import task_runable.SortByGPA;

public class StudentTesterThread 
{

	public static void main(String[] args) throws InterruptedException
	{
		try(Scanner sc=new Scanner(System.in))
		{
			List<Student> populateList = populateList();
			System.out.println("Enter SortByGPA file name..");
			SortByGPA sortByGpa=new SortByGPA(populateList,sc.next());
			System.out.println("Enter SortByDOB file name..");
			SortByDOB sortByDob=new SortByDOB(populateList,sc.next());
			Thread byGpa=new Thread(sortByGpa,"Sort By GPA");
			Thread byDob=new Thread(sortByDob,"Sort By DOB");
			byGpa.start();
			byDob.start();
			System.out.println("Main thread block on join");
			byGpa.join();
			byDob.join();
			System.out.println("Main Over");
		}
	}
}
/* OutPut::
 Enter SortByGPA file name..
Enter SortByDOB file name..
student_gpa.txt
student_dob.txt
Main thread block on join
Sort By GPA Started...
Sort By DOB Started...
Sort By GPA Over
Sort By DOB Over
Main Over
*/
